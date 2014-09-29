package com.in.service;

import java.util.List;
import java.util.Map;

import com.in.entity.Calendarinfo;


/**
 * 日程信息表（个人日程和办公日程,办公日程即为上司分工给下属..登录后也会根据日程开始时间和当天匹配,显示在首页提醒)
 * */
public interface CalendarinfoService {

	//添加部门信息
	public void addCalendarinfo(Calendarinfo calendar);
		
	//修改部门信息
	public void updateCalendarinfo(Calendarinfo calendar);
		
	//删除部门信息
	public void deleteCalendarinfo(Integer id);
		
	//根据ID查找对象
	public Calendarinfo findById(Integer id);
		
	//查询数据行数
	public int findAll(); 
		
	//Map
	public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
		
	//分页查询（根据那么查询）
	public List<Calendarinfo> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
		
}
