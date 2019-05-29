package org.dao.imp;

import java.util.List;

import org.dao.BaseDAO;
import org.dao.GlDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Glb;
import org.model.Xsb;

public class GlDaoImp extends BaseDAO implements GlDao {

	@Override
	public List findAll(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			Query query=session.createQuery("from Glb order by glh");
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
	public int findGlSize() {
		// TODO Auto-generated method stub
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			return session.createQuery("from Glb").list().size();			
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Glb find(String glh) {
		// TODO Auto-generated method stub
		try{
			System.out.println("1111");
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			System.out.println("222");
			Query query=session.createQuery("from Glb where glh=?");
			System.out.println("3333");
			query.setParameter(0, glh);
			query.setMaxResults(1);
			Glb gl=(Glb)query.uniqueResult();
			System.out.println("準備提交GL_dl事物");
			ts.commit();
			System.out.println("已提交GL_dl事物");
			session.clear();
			return gl;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}	
	}

	@Override
	public void delete(String glh) {
		// TODO Auto-generated method stub
		try{
			System.out.println("在执行xsDao的delete");
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			Glb gl=find(glh);
			session.delete(gl);
			ts.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void update(Glb gl) {
		// TODO Auto-generated method stub
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			session.update(gl);
			ts.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void save(Glb gl) {
		// TODO Auto-generated method stub
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			session.save(gl);
			ts.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
