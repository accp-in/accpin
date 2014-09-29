package com.in.dao;

import java.util.List;
import java.util.Map;

import com.in.entity.Department;
/**
 * ���ű�
 * */
public interface DepartmentDao {
	
	//��Ӳ�����Ϣ
	public void addDepartment(Department depat);
	
	//�޸Ĳ�����Ϣ
	public void updateDepartment(Department depat);
	
	//ɾ��������Ϣ
	public void deleteDepartment(Integer id);
	
	//����ID���Ҷ���
	public Department findById(Integer id);
	
	//��ѯ��������
	public int findAll(); 
	
	//Map
	public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
	
	//��ҳ��ѯ��������ô��ѯ��
	public List<Department> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
	
	
}
