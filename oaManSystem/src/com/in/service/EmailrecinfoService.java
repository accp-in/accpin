package com.in.service;

import java.util.List;
import java.util.Map;

import com.in.entity.Emailrecinfo;

/**
 * �ʼ�������Ϣ��
 * */
public interface EmailrecinfoService {
	//����ʼ���Ϣ
	public void addEmailrecinfo(Emailrecinfo email);
				
	//�޸��ʼ���Ϣ
	public void updateEmailrecinfo(Emailrecinfo email);
				
	//ɾ���ʼ���Ϣ
	public void deleteEmailrecinfo(Integer id);
				
	//����ID���Ҷ���
	public Emailrecinfo findById(Integer id);
				
	//��ѯ��������
	public int findAll(); 
	
	//Map
	public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
				
	//��ҳ��ѯ��������ô��ѯ��
	public List<Emailrecinfo> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
}
