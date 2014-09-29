package com.in.dao;

import java.util.List;
import com.in.entity.Planinfo;

/**
 * 工作计划表
 * */
public interface PlaninfoDao {

	//添加部门信息
	public void addPlaninfo(Planinfo plan);
	
	//修改部门信息
	public void updatePlaninfo(Planinfo plan);
	
	//删除部门信息
	public void deletePlaninfo(Integer id);
	
	//根据ID查找对象
	public Planinfo findById(Integer id);
	
	//查询数据行数
	public int findAll(); 
	
	//Map
	//public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
	
	//分页查询（根据那么查询）
	public List<Planinfo> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
	
}
