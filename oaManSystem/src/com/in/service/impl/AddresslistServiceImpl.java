package com.in.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.in.dao.AddresslistDao;
import com.in.entity.Addresslist;
import com.in.service.AddresslistService;

public class AddresslistServiceImpl implements AddresslistService {

	//set注入
	private AddresslistDao addresslistDao;
	
	public void setAddresslistDao(AddresslistDao addresslistDao) {
		this.addresslistDao = addresslistDao;
	}

	//添加
	@Override
	public void addAddresslist(Addresslist address) {
		// TODO Auto-generated method stub

	}

	//更新
	@Override
	public void updateAddresslist(Addresslist address) {
		// TODO Auto-generated method stub

	}

	//删除
	@Override
	public void deleteAddresslist(Integer id) {
		// TODO Auto-generated method stub

	}

	//根据ID查找对象
	@Override
	public Addresslist findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	//MAP
	@Override
	public Map<String, Object> allByPage(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		List<Addresslist> list = addresslistDao.findByList(name, pageNo, pageSize, hql, paramNames, values);
		Map<String, Object> map = new HashMap<String, Object>();
    	int count = addresslistDao.findAll(name);
    	map.put("total", count);
    	map.put("rows", list);
		return map;
		
	}

	//分页
	@Override
	public List<Addresslist> findByList(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		return addresslistDao.findByList(name, pageNo, pageSize, hql, paramNames, values);
	}

}
