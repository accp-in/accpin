package com.in.service.impl;

import java.util.List;
import java.util.Map;

import com.in.dao.AttendanceExplainDao;
import com.in.entity.AttendanceExplain;
import com.in.service.AttendanceExplainService;

public class AttendanceExplainServiceImpl implements AttendanceExplainService {

	//setע��
	private AttendanceExplainDao attendanceExplainDao;
	
	public void setAttendanceExplainDao(AttendanceExplainDao attendanceExplainDao) {
		this.attendanceExplainDao = attendanceExplainDao;
	}

	//���
	@Override
	public void addAttendanceExplain(AttendanceExplain attendance) {
		// TODO Auto-generated method stub

	}

	
	//����
	@Override
	public void updateAttendanceExplain(AttendanceExplain attendance) {
		// TODO Auto-generated method stub

	}

	//ɾ��
	@Override
	public void deleteAttendanceExplain(Integer id) {
		// TODO Auto-generated method stub

	}

	//����Id���ض���
	@Override
	public AttendanceExplain findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	//����ȫ����Ϣ��������
	@Override
	public int findAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	//MAP
	@Override
	public Map<String, Object> allByPage(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

	//��ҳ
	@Override
	public List<AttendanceExplain> findByList(String name, int pageNo,
			int pageSize, String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

}
