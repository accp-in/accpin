package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.CalendarinfoDao;
import com.in.entity.Calendarinfo;
import com.in.service.CalendarinfoService;

public class CalendarinfoServiceImpl implements CalendarinfoService {

	//set注入
	private CalendarinfoDao calendarinfoDao;
	
	public void setCalendarinfoDao(CalendarinfoDao calendarinfoDao) {
		this.calendarinfoDao = calendarinfoDao;
	}

	//添加
	@Override
	public void addCalendarinfo(Calendarinfo calendar) {
		// TODO Auto-generated method stub

	}

	//修改
	@Override
	public void updateCalendarinfo(Calendarinfo calendar) {
		// TODO Auto-generated method stub

	}

	//删除
	@Override
	public void deleteCalendarinfo(Integer id) {
		// TODO Auto-generated method stub

	}

	//返回对象
	@Override
	public Calendarinfo findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	//返回全部条数
	@Override
	public int findAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	//MAP
	@Override
	public Map<String, Object> allByPage(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

	//分页
	@Override
	public List<Calendarinfo> findByList(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
