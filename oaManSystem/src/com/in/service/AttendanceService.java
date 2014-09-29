package com.in.service;

import java.util.List;
import java.util.Map;

import com.in.entity.Attendance;


/**
 * ���ڱ�
 * */
public interface AttendanceService {

	//��ӿ��ڱ���Ϣ
	public void addAttendance(Attendance dance);
			
	//�޸Ŀ��ڱ���Ϣ
	public void updateAttendance(Attendance dance);
			
	//ɾ�����ڱ���Ϣ
	public void deleteAttendance(Integer id);
		
	//����ID���Ҷ���
	public Attendance findById(Integer id);
			
	//��ѯ��������
	public int findAll(); 
			
	//Map
	public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
			
	//��ҳ��ѯ��������ô��ѯ��
	public List<Attendance> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
			
}
