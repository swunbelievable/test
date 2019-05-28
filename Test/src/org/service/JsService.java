package org.service;

import java.util.List;

import org.model.Jsb;

public interface JsService {
	public List findAll(int pageNow, int pageSize);		//显示所有教师信息
	public int findJsSize();							//查询一共多少条教师记录
	
	/* 服务：查看某个教师的详细信息 */
	public Jsb find(String jsh);							//根据教师号查询某教师信息
	
	/* 服务：删除某教师信息 */
	public void delete(String jsh);						//根据教师号删除学生
	
	/* 服务：修改某教师信息 */
	public void update(Jsb js);							//修改教师信息
	
	/* 服务：教师信息录入 */
	public void save(Jsb js);							//插入教师
}
