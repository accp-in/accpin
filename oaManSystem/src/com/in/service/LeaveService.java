package com.in.service;

import java.util.List;
import java.util.Map;

import com.in.entity.Leave;


/**
 * 请假表
 * */
public interface LeaveService {
	
	//添加请假信息
	public void addLeave(Leave levave);
					
	//修改请假信息
	public void updateLeave(Leave levave);
					
	//删除请假信息
	public void deleteLeave(Integer id);
				
	//根据ID查找对象
	public Leave findById(Integer id);
					
	//查询数据行数
	public int findAll(); 
					
	//Map
	public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
					
	//分页查询（根据那么查询）
	public List<Leave> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
					
}
