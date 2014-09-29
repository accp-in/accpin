package com.in.service;

import java.util.List;
import java.util.Map;

import com.in.entity.Calendarinfo;


/**
 * �ճ���Ϣ�������ճ̺Ͱ칫�ճ�,�칫�ճ̼�Ϊ��˾�ֹ�������..��¼��Ҳ������ճ̿�ʼʱ��͵���ƥ��,��ʾ����ҳ����)
 * */
public interface CalendarinfoService {

	//��Ӳ�����Ϣ
	public void addCalendarinfo(Calendarinfo calendar);
		
	//�޸Ĳ�����Ϣ
	public void updateCalendarinfo(Calendarinfo calendar);
		
	//ɾ��������Ϣ
	public void deleteCalendarinfo(Integer id);
		
	//����ID���Ҷ���
	public Calendarinfo findById(Integer id);
		
	//��ѯ��������
	public int findAll(); 
		
	//Map
	public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
		
	//��ҳ��ѯ��������ô��ѯ��
	public List<Calendarinfo> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
		
}
