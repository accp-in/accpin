package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.MessageinfoDao;
import com.in.entity.Messageinfo;
import com.in.service.MessageinfoService;

public class MessageinfoServiceImpl implements MessageinfoService {

	//set注入
	private MessageinfoDao messageinfoDao;
	
	public void setMessageinfoDao(MessageinfoDao messageinfoDao) {
		this.messageinfoDao = messageinfoDao;
	}

	
	//添加
	@Override
	public void addMessageinfo(Messageinfo message) {
		// TODO Auto-generated method stub

	}

	//修改
	@Override
	public void updateMessageinfo(Messageinfo message) {
		// TODO Auto-generated method stub

	}

	//删除
	@Override
	public void deleteMessageinfo(Integer id) {
		// TODO Auto-generated method stub

	}

	//返回对象
	@Override
	public Messageinfo findById(Integer id) {
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
	public List<Messageinfo> findByList(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
