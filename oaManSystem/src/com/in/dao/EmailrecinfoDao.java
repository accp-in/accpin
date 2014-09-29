package com.in.dao;

import java.util.List;
import com.in.entity.Emailrecinfo;

/**
 * �ʼ�������Ϣ��
 * */
public interface EmailrecinfoDao {
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
				
	//��ҳ��ѯ��������ô��ѯ��
	public List<Emailrecinfo> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
}
