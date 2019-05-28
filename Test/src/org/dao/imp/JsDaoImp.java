package org.dao.imp;

import java.util.List;

import org.dao.BaseDAO;
import org.dao.JsDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Jsb;
import org.model.Xsb;

public class JsDaoImp extends BaseDAO implements JsDao {

	@Override
	public List findAll(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			Query query=session.createQuery("from Jsb order by jsh");
			int firstResult=(pageNow-1)*pageSize;
			query.setFirstResult(firstResult);
			query.setMaxResults(pageSize);
			List list=query.list();
			ts.commit();
			session.close();
			session=null;
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int findJsSize() {
		// TODO Auto-generated method stub
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			return session.createQuery("from Jsb").list().size();			
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Jsb find(String jsh) {
		// TODO Auto-generated method stub
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			Query query=session.createQuery("from Jsb where jsh=?");
			query.setParameter(0, jsh);
			query.setMaxResults(1);
			Jsb js=(Jsb)query.uniqueResult();
			ts.commit();
			session.clear();
			return js;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}	
	}

	@Override
	public void delete(String jsh) {
		// TODO Auto-generated method stub
		try{
			System.out.println("ÔÚÖ´ÐÐjsDaoµÄdelete");
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			Jsb js=find(jsh);
			session.delete(js);
			ts.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void update(Jsb js) {
		// TODO Auto-generated method stub
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			session.update(js);
			ts.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void save(Jsb js) {
		// TODO Auto-generated method stub
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			session.save(js);
			ts.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
