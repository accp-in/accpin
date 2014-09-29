package com.in.service;

import java.util.List;
import java.util.Map;

import com.in.entity.Emailsendinfo;


/**
 * �ʼ�������Ϣ��
 * */
public interface EmailsendinfoService {
	
	//����ʼ���Ϣ
	public void addEmailsendinfo(Emailsendinfo emailSend);
					
	//�޸��ʼ���Ϣ
	public void updateEmailsendinfo(Emailsendinfo emailSend);
					
	//ɾ���ʼ���Ϣ
	public void deleteEmailsendinfo(Integer id);
					
	//����ID���Ҷ���
	public Emailsendinfo findById(Integer id);
					
	//��ѯ��������
	public int findAll(); 
	
	//Map
	public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
					
	//��ҳ��ѯ��������ô��ѯ��
	public List<Emailsendinfo> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
}
