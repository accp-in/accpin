package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.DepartmentDao;
import com.in.entity.Department;
import com.in.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

	//setע��
	private DepartmentDao departmentDao;
	
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	//���
	@Override
	public void addDepartment(Department depat) {
		// TODO Auto-generated method stub

	}

	//�޸�
	@Override
	public void updateDepartment(Department depat) {
		// TODO Auto-generated method stub

	}

	//ɾ��
	@Override
	public void deleteDepartment(Integer id) {
		// TODO Auto-generated method stub

	}

	//���ض���
	@Override
	public Department findById(Integer id) {
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
	public List<Department> findByList(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
