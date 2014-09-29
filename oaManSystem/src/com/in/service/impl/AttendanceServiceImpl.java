package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.AttendanceDao;
import com.in.entity.Attendance;
import com.in.service.AttendanceService;

public class AttendanceServiceImpl implements AttendanceService {

	//set注入
	private AttendanceDao attendanceDao;
	
	public void setAttendanceDao(AttendanceDao attendanceDao) {
		this.attendanceDao = attendanceDao;
	}

	//添加
	@Override
	public void addAttendance(Attendance dance) {
		// TODO Auto-generated method stub

	}

	//修改
	@Override
	public void updateAttendance(Attendance dance) {
		// TODO Auto-generated method stub

	}

	//删除
	@Override
	public void deleteAttendance(Integer id) {
		// TODO Auto-generated method stub

	}

	
	//添加
	@Override
	public Attendance findById(Integer id) {
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
	public List<Attendance> findByList(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
