package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.LeaveDao;
import com.in.entity.Leave;
import com.in.service.LeaveService;

public class LeaveServiceImpl implements LeaveService {

	//setע��
	private LeaveDao leaveDao;
	
	public void setLeaveDao(LeaveDao leaveDao) {
		this.leaveDao = leaveDao;
	}

	
	//���
	@Override
	public void addLeave(Leave levave) {
		// TODO Auto-generated method stub

	}

	//�޸�
	@Override
	public void updateLeave(Leave levave) {
		// TODO Auto-generated method stub

	}

	//ɾ��
	@Override
	public void deleteLeave(Integer id) {
		// TODO Auto-generated method stub

	}

	//���ض���
	@Override
	public Leave findById(Integer id) {
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
	public List<Leave> findByList(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
