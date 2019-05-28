package org.service.imp;

import java.util.List;
import org.dao.*;
import org.model.Glb;
import org.service.GlService;

public class GlServiceManage implements GlService {
	
	private GlDao glDao;
	@Override
	public List findAll(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return glDao.findAll(pageNow, pageSize);
	}

	public GlDao getGlDao() {
		return glDao;
	}

	public void setGlDao(GlDao glDao) {
		this.glDao = glDao;
	}

	@Override
	public int findGlSize() {
		// TODO Auto-generated method stub
		return glDao.findGlSize();
	}

	@Override
	public Glb find(String glh) {
		// TODO Auto-generated method stub
		return glDao.find(glh);
	}

	@Override
	public void delete(String glh) {
		// TODO Auto-generated method stub
		glDao.delete(glh);
	}

	@Override
	public void update(Glb gl) {
		// TODO Auto-generated method stub
		glDao.update(gl);
	}

	@Override
	public void save(Glb gl) {
		// TODO Auto-generated method stub

	}

}
