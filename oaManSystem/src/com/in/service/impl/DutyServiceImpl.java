package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.DutyDao;
import com.in.entity.Duty;
import com.in.service.DutyService;

public class DutyServiceImpl implements DutyService {

	//setע��
	private DutyDao dutyDao;
	
	public void setDutyDao(DutyDao dutyDao) {
		this.dutyDao = dutyDao;
	}

	
	//���
	@Override
	public void addDuty(Duty duty) {
		// TODO Auto-generated method stub

	}

	//�޸�
	@Override
	public void updateDuty(Duty duty) {
		// TODO Auto-generated method stub

	}

	//ɾ��
	@Override
	public void deleteDuty(Integer id) {
		// TODO Auto-generated method stub

	}

	//���ض���
	@Override
	public Duty findById(Integer id) {
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
	public List<Duty> findByList(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
