package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.EmailrecinfoDao;
import com.in.entity.Emailrecinfo;
import com.in.service.EmailrecinfoService;

public class EmailrecinfoServiceImpl implements EmailrecinfoService {

	//setע��
	private EmailrecinfoDao emailrecinfoDao;
	
	public void setEmailrecinfoDao(EmailrecinfoDao emailrecinfoDao) {
		this.emailrecinfoDao = emailrecinfoDao;
	}

	
	//���
	@Override
	public void addEmailrecinfo(Emailrecinfo email) {
		// TODO Auto-generated method stub

	}

	//�޸�
	@Override
	public void updateEmailrecinfo(Emailrecinfo email) {
		// TODO Auto-generated method stub

	}

	//ɾ��
	@Override
	public void deleteEmailrecinfo(Integer id) {
		// TODO Auto-generated method stub

	}

	//���ض���
	@Override
	public Emailrecinfo findById(Integer id) {
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
	public List<Emailrecinfo> findByList(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
