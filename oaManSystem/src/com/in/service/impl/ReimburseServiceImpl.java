package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.ReimburseDao;
import com.in.entity.Reimburse;
import com.in.service.ReimburseService;

public class ReimburseServiceImpl implements ReimburseService {

	//set注入
	private ReimburseDao reimburseDao;
	
	public void setReimburseDao(ReimburseDao reimburseDao) {
		this.reimburseDao = reimburseDao;
	}

	
	//添加
	@Override
	public void addReimburse(Reimburse reimburse) {
		// TODO Auto-generated method stub

	}

	//修改
	@Override
	public void updateReimburse(Reimburse reimburse) {
		// TODO Auto-generated method stub

	}

	//删除
	@Override
	public void deleteReimburse(Integer id) {
		// TODO Auto-generated method stub

	}

	
	//返回对象
	@Override
	public Reimburse findById(Integer id) {
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
	public List<Reimburse> findByList(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
