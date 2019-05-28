package org.dao;

import java.util.*;
import org.model.*;
public interface GlDao {
	/* 方法：管理信息查询 */
	public List findAll(int pageNow, int pageSize);		//显示所有管理信息
	public int findGlSize();							//查询一共多少条管理记录
	
	/* 方法：查看某个管理的详细信息 */
	public Glb find(String glh);							//根据管理号查询某管理信息
	
	/* 方法：删除某管理信息 */
	public void delete(String glh);						//根据管理号删除管理
	
	/* 方法：修改某管理信息 */
	public void update(Glb gl);							//修改管理员信息
	
	/* 方法：管理信息录入 */
	public void save(Glb gl);							//插入管理
}
