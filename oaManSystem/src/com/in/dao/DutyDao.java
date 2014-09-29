package com.in.dao;

import java.util.List;
import java.util.Map;

import com.in.entity.Duty;

/**
 * ְ���
 * */
public interface DutyDao {
	
	//���ְ����Ϣ
	public void addDuty(Duty duty);
		
	//�޸�ְ����Ϣ
	public void updateDuty(Duty duty);
		
	//ɾ��ְ����Ϣ
	public void deleteDuty(Integer id);
		
	//����ID���Ҷ���
	public Duty findById(Integer id);
	
	//��ѯ��������
	public int findAll(); 
	//Map
	public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
		
	//��ҳ��ѯ��������ô��ѯ��
	public List<Duty> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
}
