package com.in.dao;

import java.util.List;
import com.in.entity.AttendanceExplain;

/**
 * 未考勤解释说明表
 * */
public interface AttendanceExplainDao {
		
	//添加考勤表信息
	public void addAttendanceExplain(AttendanceExplain attendance);
				
	//修改考勤表信息
	public void updateAttendanceExplain(AttendanceExplain attendance);
				
	//删除考勤表信息
	public void deleteAttendanceExplain(Integer id);
			
	//根据ID查找对象
	public AttendanceExplain findById(Integer id);
				
	//查询数据行数
	public int findAll(); 
						
	//分页查询（根据那么查询）
	public List<AttendanceExplain> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
				
}
