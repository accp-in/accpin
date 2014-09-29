package com.in.service;

import java.util.List;
import java.util.Map;

import com.in.entity.AttendanceExplain;

/**
 * δ���ڽ���˵����
 * */
public interface AttendanceExplainService {
		
	//��ӿ��ڱ���Ϣ
	public void addAttendanceExplain(AttendanceExplain attendance);
				
	//�޸Ŀ��ڱ���Ϣ
	public void updateAttendanceExplain(AttendanceExplain attendance);
				
	//ɾ�����ڱ���Ϣ
	public void deleteAttendanceExplain(Integer id);
			
	//����ID���Ҷ���
	public AttendanceExplain findById(Integer id);
				
	//��ѯ��������
	public int findAll(); 
				
	//Map
	public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
				
	//��ҳ��ѯ��������ô��ѯ��
	public List<AttendanceExplain> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
				
}
