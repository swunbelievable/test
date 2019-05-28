package org.service.imp;

import java.util.List;

import org.dao.JsDao;
import org.model.Jsb;
import org.service.JsService;

public class JsServiceManage implements JsService {

	private JsDao jsDao;
	@Override
	public List findAll(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return jsDao.findAll(pageNow, pageSize);
	}
	@Override
	public int findJsSize() {
		// TODO Auto-generated method stub
		return jsDao.findJsSize();
	}

	@Override
	public Jsb find(String jsh) {
		// TODO Auto-generated method stub
		return jsDao.find(jsh);
	}

	@Override
	public void delete(String jsh) {
		// TODO Auto-generated method stub
		jsDao.delete(jsh);
	}

	@Override
	public void update(Jsb js) {
		// TODO Auto-generated method stub
		jsDao.update(js);
	}

	@Override
	public void save(Jsb js) {
		// TODO Auto-generated method stub

	}
	
	public JsDao getJsDao() {
		return jsDao;
	}

	public void setJsDao(JsDao jsDao) {
		this.jsDao = jsDao;
	}

}
