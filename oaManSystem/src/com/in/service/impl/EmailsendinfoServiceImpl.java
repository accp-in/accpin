package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.EmailsendinfoDao;
import com.in.entity.Emailsendinfo;
import com.in.service.EmailsendinfoService;

public class EmailsendinfoServiceImpl implements EmailsendinfoService {

	//set注入
	private EmailsendinfoDao emailsendinfoDao;
	
	public void setEmailsendinfoDao(EmailsendinfoDao emailsendinfoDao) {
		this.emailsendinfoDao = emailsendinfoDao;
	}

	
	//添加
	@Override
	public void addEmailsendinfo(Emailsendinfo emailSend) {
		// TODO Auto-generated method stub

	}

	//修改
	@Override
	public void updateEmailsendinfo(Emailsendinfo emailSend) {
		// TODO Auto-generated method stub

	}

	//删除
	@Override
	public void deleteEmailsendinfo(Integer id) {
		// TODO Auto-generated method stub

	}

	//返回对象
	@Override
	public Emailsendinfo findById(Integer id) {
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
	public List<Emailsendinfo> findByList(String name, int pageNo,
			int pageSize, String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
