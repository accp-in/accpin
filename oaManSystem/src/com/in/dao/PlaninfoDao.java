package com.in.dao;

import java.util.List;
import com.in.entity.Planinfo;

/**
 * �����ƻ���
 * */
public interface PlaninfoDao {

	//���Ӳ�����Ϣ
	public void addPlaninfo(Planinfo plan);
	
	//�޸Ĳ�����Ϣ
	public void updatePlaninfo(Planinfo plan);
	
	//ɾ��������Ϣ
	public void deletePlaninfo(Integer id);
	
	//����ID���Ҷ���
	public Planinfo findById(Integer id);
	
	//��ѯ��������
	public int findAll(); 
	
	//Map
	//public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
	
	//��ҳ��ѯ��������ô��ѯ��
	public List<Planinfo> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
	
}