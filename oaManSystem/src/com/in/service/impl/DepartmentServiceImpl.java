package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.DepartmentDao;
import com.in.entity.Department;
import com.in.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

	//set注入
	private DepartmentDao departmentDao;
	
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	//添加
	@Override
	public void addDepartment(Department depat) {
		// TODO Auto-generated method stub

	}

	//修改
	@Override
	public void updateDepartment(Department depat) {
		// TODO Auto-generated method stub

	}

	//删除
	@Override
	public void deleteDepartment(Integer id) {
		// TODO Auto-generated method stub

	}

	//返回对象
	@Override
	public Department findById(Integer id) {
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
	public List<Department> findByList(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
