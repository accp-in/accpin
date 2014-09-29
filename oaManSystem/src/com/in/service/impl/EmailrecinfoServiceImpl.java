package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.EmailrecinfoDao;
import com.in.entity.Emailrecinfo;
import com.in.service.EmailrecinfoService;

public class EmailrecinfoServiceImpl implements EmailrecinfoService {

	//set注入
	private EmailrecinfoDao emailrecinfoDao;
	
	public void setEmailrecinfoDao(EmailrecinfoDao emailrecinfoDao) {
		this.emailrecinfoDao = emailrecinfoDao;
	}

	
	//添加
	@Override
	public void addEmailrecinfo(Emailrecinfo email) {
		// TODO Auto-generated method stub

	}

	//修改
	@Override
	public void updateEmailrecinfo(Emailrecinfo email) {
		// TODO Auto-generated method stub

	}

	//删除
	@Override
	public void deleteEmailrecinfo(Integer id) {
		// TODO Auto-generated method stub

	}

	//返回对象
	@Override
	public Emailrecinfo findById(Integer id) {
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
	public List<Emailrecinfo> findByList(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
