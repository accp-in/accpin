package com.in.service;

import java.util.List;
import java.util.Map;

import com.in.entity.Attendance;


/**
 * 考勤表
 * */
public interface AttendanceService {

	//添加考勤表信息
	public void addAttendance(Attendance dance);
			
	//修改考勤表信息
	public void updateAttendance(Attendance dance);
			
	//删除考勤表信息
	public void deleteAttendance(Integer id);
		
	//根据ID查找对象
	public Attendance findById(Integer id);
			
	//查询数据行数
	public int findAll(); 
			
	//Map
	public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
			
	//分页查询（根据那么查询）
	public List<Attendance> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
			
}
