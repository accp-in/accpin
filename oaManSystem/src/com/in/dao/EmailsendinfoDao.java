package com.in.dao;

import java.util.List;
import com.in.entity.Emailsendinfo;


/**
 * �ʼ�������Ϣ��
 * */
public interface EmailsendinfoDao {
	
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
					
	//��ҳ��ѯ��������ô��ѯ��
	public List<Emailsendinfo> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
}
