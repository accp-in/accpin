package com.in.service;

import java.util.List;
import java.util.Map;

import com.in.entity.Notice;


/**
 * �����
 * */
public interface NoticeService {

	//��ӹ�����Ϣ
	public void addNotice(Notice notice);
		
	//�޸Ĺ�����Ϣ
	public void updateNotice(Notice notice);
		
	//ɾ��������Ϣ
	public void deleteNotice(Integer id);
		
	//����ID���Ҷ���
	public Notice findById(Integer id);
		
	//��ѯ��������
	public int findAll(); 
	
	//Map
	public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
		
	//��ҳ��ѯ��������ô��ѯ��
	public List<Notice> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
			
}
