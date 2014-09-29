package com.in.service;

import java.util.List;
import java.util.Map;

import com.in.entity.Leave;


/**
 * ��ٱ�
 * */
public interface LeaveService {
	
	//��������Ϣ
	public void addLeave(Leave levave);
					
	//�޸������Ϣ
	public void updateLeave(Leave levave);
					
	//ɾ�������Ϣ
	public void deleteLeave(Integer id);
				
	//����ID���Ҷ���
	public Leave findById(Integer id);
					
	//��ѯ��������
	public int findAll(); 
					
	//Map
	public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
					
	//��ҳ��ѯ��������ô��ѯ��
	public List<Leave> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
					
}
