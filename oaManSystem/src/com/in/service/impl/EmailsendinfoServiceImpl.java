package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.EmailsendinfoDao;
import com.in.entity.Emailsendinfo;
import com.in.service.EmailsendinfoService;

public class EmailsendinfoServiceImpl implements EmailsendinfoService {

	//setע��
	private EmailsendinfoDao emailsendinfoDao;
	
	public void setEmailsendinfoDao(EmailsendinfoDao emailsendinfoDao) {
		this.emailsendinfoDao = emailsendinfoDao;
	}

	
	//���
	@Override
	public void addEmailsendinfo(Emailsendinfo emailSend) {
		// TODO Auto-generated method stub

	}

	//�޸�
	@Override
	public void updateEmailsendinfo(Emailsendinfo emailSend) {
		// TODO Auto-generated method stub

	}

	//ɾ��
	@Override
	public void deleteEmailsendinfo(Integer id) {
		// TODO Auto-generated method stub

	}

	//���ض���
	@Override
	public Emailsendinfo findById(Integer id) {
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
	public List<Emailsendinfo> findByList(String name, int pageNo,
			int pageSize, String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
