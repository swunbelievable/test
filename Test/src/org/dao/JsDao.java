package org.dao;
import java.util.*;
import org.model.*;
public interface JsDao {
	/* 方法：教师信息查询 */
	public List findAll(int pageNow, int pageSize);		//显示所有教师信息
	public int findJsSize();							//查询一共多少条教师记录
	
	/* 方法：查看某个教师的详细信息 */
	public Jsb find(String jsh);							//教师号查询某教师信息
	
	/* 方法：删除某教师信息 */
	public void delete(String jsh);						//根据教师号删除教师
	
	/* 方法：修改某教师信息 */
	public void update(Jsb js);							//修改教师信息
	
	/* 方法：教师信息录入 */
	public void save(Jsb js);							//插入教师
}