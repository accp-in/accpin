package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.NoticeDao;
import com.in.entity.Notice;
import com.in.service.NoticeService;

public class NoticeServiceImpl implements NoticeService {

	//setע��
	private NoticeDao noticeDao;
	
	public void setNoticeDao(NoticeDao noticeDao) {
		this.noticeDao = noticeDao;
	}

	
	//���
	@Override
	public void addNotice(Notice notice) {
		// TODO Auto-generated method stub

	}

	//�޸�
	@Override
	public void updateNotice(Notice notice) {
		// TODO Auto-generated method stub

	}

	//ɾ��
	@Override
	public void deleteNotice(Integer id) {
		// TODO Auto-generated method stub

	}

	//���ض���
	@Override
	public Notice findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	//����ȫ������
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

	//��ҳ
	@Override
	public List<Notice> findByList(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
