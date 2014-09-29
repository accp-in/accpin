package com.in.dao;

import java.util.List;
import com.in.entity.AttendanceExplain;

/**
 * δ���ڽ���˵����
 * */
public interface AttendanceExplainDao {
		
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
						
	//��ҳ��ѯ��������ô��ѯ��
	public List<AttendanceExplain> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
				
}
