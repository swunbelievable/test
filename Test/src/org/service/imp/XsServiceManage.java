package org.service.imp;
import java.util.*;
import org.dao.*;
import org.service.*;
import org.model.*;
public class XsServiceManage implements XsService{
	private XsDao xsDao;
	private CjDao cjDao;
	/* 业务实现：学生信息查询 */
	public List findAll(int pageNow, int pageSize){
		return xsDao.findAll(pageNow, pageSize);
	}
	public int findXsSize(){
		return xsDao.findXsSize();
	}
	
	/* 业务实现：查看某个学生的详细信息 */
	public Xsb find(String xh){
		return xsDao.find(xh);
	}
	
	/* 业务实现：删除某学生信息 */
	public void delete(String xh){
		System.out.println("准备执行xsDao的delete");
		xsDao.delete(xh);
		System.out.println("执行完xsDao的delete，准备执行cjDao的deleteOneXscj");
		cjDao.deleteOneXsCj(xh);			//删除学生的同时要删除该生对应的成绩
		System.out.println("执行完cjDao的deleteOneXscj");
	}
	
	/* 业务实现：修改某学生信息 */
	public void update(Xsb xs){
		xsDao.update(xs);
	}
	
	/* 业务实现：学生信息录入 */
	public void save(Xsb xs){
		xsDao.save(xs);
	}
	
	public XsDao getXsDao(){
		return xsDao;
	}
	public void setXsDao(XsDao xsDao){
		this.xsDao = xsDao;
	}
	
	public CjDao getCjDao(){
		return cjDao;
	}
	public void setCjDao(CjDao cjDao){
		this.cjDao = cjDao;
	}
	
}
