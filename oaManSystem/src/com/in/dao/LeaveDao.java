package com.in.dao;

import java.util.List;
import com.in.entity.Leave;


/**
 * ��ٱ�
 * */
public interface LeaveDao {
	
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
	//public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
					
	//��ҳ��ѯ��������ô��ѯ��
	public List<Leave> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
					
}
