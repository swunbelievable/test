package org.service.imp;
import java.util.*;
import org.dao.*;
import org.service.*;
import org.model.*;
public class KcServiceManage implements KcService{
	private KcDao kcDao;
	/* ҵ��ʵ�֣��ɼ���Ϣ¼�� */
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
	//	cjDao.deleteOneXsCj(xh);                 //�ݲ�ɾ��ѧ���γ̵ĳɼ�
	}
	public void update(Kcb kcb){
		kcDao.update(kcb);
	}
	public void save(Kcb kcb){
		kcDao.save(kcb);
	}
}
