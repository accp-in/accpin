package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.LeaveDao;
import com.in.entity.Leave;
import com.in.service.LeaveService;

public class LeaveServiceImpl implements LeaveService {

	//set注入
	private LeaveDao leaveDao;
	
	public void setLeaveDao(LeaveDao leaveDao) {
		this.leaveDao = leaveDao;
	}

	
	//添加
	@Override
	public void addLeave(Leave levave) {
		// TODO Auto-generated method stub

	}

	//修改
	@Override
	public void updateLeave(Leave levave) {
		// TODO Auto-generated method stub

	}

	//删除
	@Override
	public void deleteLeave(Integer id) {
		// TODO Auto-generated method stub

	}

	//返回对象
	@Override
	public Leave findById(Integer id) {
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
	public List<Leave> findByList(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
