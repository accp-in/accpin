package com.in.service;

import java.util.List;
import java.util.Map;

import com.in.entity.Notice;


/**
 * 公告表
 * */
public interface NoticeService {

	//添加公告信息
	public void addNotice(Notice notice);
		
	//修改公告信息
	public void updateNotice(Notice notice);
		
	//删除公告信息
	public void deleteNotice(Integer id);
		
	//根据ID查找对象
	public Notice findById(Integer id);
		
	//查询数据行数
	public int findAll(); 
	
	//Map
	public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
		
	//分页查询（根据那么查询）
	public List<Notice> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
			
}
