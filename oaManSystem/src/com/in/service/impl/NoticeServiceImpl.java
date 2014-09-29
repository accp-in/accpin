package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.NoticeDao;
import com.in.entity.Notice;
import com.in.service.NoticeService;

public class NoticeServiceImpl implements NoticeService {

	//set注入
	private NoticeDao noticeDao;
	
	public void setNoticeDao(NoticeDao noticeDao) {
		this.noticeDao = noticeDao;
	}

	
	//添加
	@Override
	public void addNotice(Notice notice) {
		// TODO Auto-generated method stub

	}

	//修改
	@Override
	public void updateNotice(Notice notice) {
		// TODO Auto-generated method stub

	}

	//删除
	@Override
	public void deleteNotice(Integer id) {
		// TODO Auto-generated method stub

	}

	//返回对象
	@Override
	public Notice findById(Integer id) {
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
	public List<Notice> findByList(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
