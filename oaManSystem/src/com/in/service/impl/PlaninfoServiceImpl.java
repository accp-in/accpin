package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.PlaninfoDao;
import com.in.entity.Planinfo;
import com.in.service.PlaninfoService;

public class PlaninfoServiceImpl implements PlaninfoService {

	//setע��
	private PlaninfoDao planinfoDao;
	
	public void setPlaninfoDao(PlaninfoDao planinfoDao) {
		this.planinfoDao = planinfoDao;
	}

	
	//���
	@Override
	public void addPlaninfo(Planinfo plan) {
		// TODO Auto-generated method stub

	}

	//�޸�
	@Override
	public void updatePlaninfo(Planinfo plan) {
		// TODO Auto-generated method stub

	}

	//ɾ��
	@Override
	public void deletePlaninfo(Integer id) {
		// TODO Auto-generated method stub

	}

	//���ض���
	@Override
	public Planinfo findById(Integer id) {
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
	public List<Planinfo> findByList(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
