package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.AttendanceExplainDao;
import com.in.entity.AttendanceExplain;
import com.in.service.AttendanceExplainService;

public class AttendanceExplainServiceImpl implements AttendanceExplainService {

	//set注入
	private AttendanceExplainDao attendanceExplainDao;
	
	public void setAttendanceExplainDao(AttendanceExplainDao attendanceExplainDao) {
		this.attendanceExplainDao = attendanceExplainDao;
	}

	//添加
	@Override
	public void addAttendanceExplain(AttendanceExplain attendance) {
		// TODO Auto-generated method stub

	}

	
	//更新
	@Override
	public void updateAttendanceExplain(AttendanceExplain attendance) {
		// TODO Auto-generated method stub

	}

	//删除
	@Override
	public void deleteAttendanceExplain(Integer id) {
		// TODO Auto-generated method stub

	}

	//根据Id返回对象
	@Override
	public AttendanceExplain findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	//查找全部信息返回条数
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
	public List<AttendanceExplain> findByList(String name, int pageNo,
			int pageSize, String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
