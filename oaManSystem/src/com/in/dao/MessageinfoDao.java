package com.in.dao;

import java.util.List;
import com.in.entity.Messageinfo;


/**
 * 短信息表
 * */
public interface MessageinfoDao {

	//添加短信息
	public void addMessageinfo(Messageinfo message);
			
	//修改短信息
	public void updateMessageinfo(Messageinfo message);
			
	//删除短信息
	public void deleteMessageinfo(Integer id);
			
	//根据ID查找对象
	public Messageinfo findById(Integer id);
			
	//查询数据行数
	public int findAll(); 
			
	//Map
	//public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
	
	//分页查询（根据那么查询）
	public List<Messageinfo> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
				
}
