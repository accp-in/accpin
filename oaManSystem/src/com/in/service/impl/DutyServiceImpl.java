package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.DutyDao;
import com.in.entity.Duty;
import com.in.service.DutyService;

public class DutyServiceImpl implements DutyService {

	//set注入
	private DutyDao dutyDao;
	
	public void setDutyDao(DutyDao dutyDao) {
		this.dutyDao = dutyDao;
	}

	
	//添加
	@Override
	public void addDuty(Duty duty) {
		// TODO Auto-generated method stub

	}

	//修改
	@Override
	public void updateDuty(Duty duty) {
		// TODO Auto-generated method stub

	}

	//删除
	@Override
	public void deleteDuty(Integer id) {
		// TODO Auto-generated method stub

	}

	//返回对象
	@Override
	public Duty findById(Integer id) {
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
	public List<Duty> findByList(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
