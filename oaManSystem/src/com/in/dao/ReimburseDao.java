package com.in.dao;

import java.util.List;
import com.in.entity.Reimburse;

/**
 * 报销表
 * */
public interface ReimburseDao {

	//添加报销表信息
	public void addReimburse(Reimburse reimburse);
						
	//修改报销表信息
	public void updateReimburse(Reimburse reimburse);
						
	//删除报销表信息
	public void deleteReimburse(Integer id);
					
	//根据ID查找对象
	public Reimburse findById(Integer id);
						
	//查询数据行数
	public int findAll(); 
						
	//Map
	//public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
						
	//分页查询（根据那么查询）
	public List<Reimburse> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
						
}
