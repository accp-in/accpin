package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.ReimburseDao;
import com.in.entity.Reimburse;
import com.in.service.ReimburseService;

public class ReimburseServiceImpl implements ReimburseService {

	//setע��
	private ReimburseDao reimburseDao;
	
	public void setReimburseDao(ReimburseDao reimburseDao) {
		this.reimburseDao = reimburseDao;
	}

	
	//���
	@Override
	public void addReimburse(Reimburse reimburse) {
		// TODO Auto-generated method stub

	}

	//�޸�
	@Override
	public void updateReimburse(Reimburse reimburse) {
		// TODO Auto-generated method stub

	}

	//ɾ��
	@Override
	public void deleteReimburse(Integer id) {
		// TODO Auto-generated method stub

	}

	
	//���ض���
	@Override
	public Reimburse findById(Integer id) {
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
	public List<Reimburse> findByList(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
