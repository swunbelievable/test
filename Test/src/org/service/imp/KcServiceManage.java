package org.service.imp;
import java.util.*;
import org.dao.*;
import org.service.*;
import org.model.*;
public class KcServiceManage implements KcService{
	private KcDao kcDao;
	/* 业务实现：成绩信息录入 */
	public List findAll(int pageNow, int pageSize){
		return kcDao.findAll(pageNow, pageSize);
	}
	public int findKcSize(){
		return kcDao.findKcSize();
	}
	public Kcb find(String kch){
		return kcDao.find(kch);
	}
	
	public KcDao getKcDao(){
		return kcDao;
	}
	public void setKcDao(KcDao kcDao){
		this.kcDao = kcDao;
	}
	
	public void delete(String kch){
		kcDao.delete(kch);
	//	cjDao.deleteOneXsCj(xh);                 //暂不删除学生课程的成绩
	}
	public void update(Kcb kcb){
		kcDao.update(kcb);
	}
	public void save(Kcb kcb){
		kcDao.save(kcb);
	}
}
