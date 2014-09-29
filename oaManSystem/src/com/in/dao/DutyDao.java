package com.in.dao;

import java.util.List;
import java.util.Map;

import com.in.entity.Duty;

/**
 * 职务表
 * */
public interface DutyDao {
	
	//添加职务信息
	public void addDuty(Duty duty);
		
	//修改职务信息
	public void updateDuty(Duty duty);
		
	//删除职务信息
	public void deleteDuty(Integer id);
		
	//根据ID查找对象
	public Duty findById(Integer id);
	
	//查询数据行数
	public int findAll(); 
	//Map
	public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
		
	//分页查询（根据那么查询）
	public List<Duty> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
}
