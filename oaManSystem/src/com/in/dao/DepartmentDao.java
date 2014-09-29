package com.in.dao;

import java.util.List;
import java.util.Map;

import com.in.entity.Department;
/**
 * 部门表
 * */
public interface DepartmentDao {
	
	//添加部门信息
	public void addDepartment(Department depat);
	
	//修改部门信息
	public void updateDepartment(Department depat);
	
	//删除部门信息
	public void deleteDepartment(Integer id);
	
	//根据ID查找对象
	public Department findById(Integer id);
	
	//查询数据行数
	public int findAll(); 
	
	//Map
	public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
	
	//分页查询（根据那么查询）
	public List<Department> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
	
	
}
