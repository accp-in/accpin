package com.in.service;

import java.util.List;
import java.util.Map;

import com.in.entity.Emailrecinfo;

/**
 * 邮件接收信息表
 * */
public interface EmailrecinfoService {
	//添加邮件信息
	public void addEmailrecinfo(Emailrecinfo email);
				
	//修改邮件信息
	public void updateEmailrecinfo(Emailrecinfo email);
				
	//删除邮件信息
	public void deleteEmailrecinfo(Integer id);
				
	//根据ID查找对象
	public Emailrecinfo findById(Integer id);
				
	//查询数据行数
	public int findAll(); 
	
	//Map
	public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
				
	//分页查询（根据那么查询）
	public List<Emailrecinfo> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
}
