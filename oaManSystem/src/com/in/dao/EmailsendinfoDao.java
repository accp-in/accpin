package com.in.dao;

import java.util.List;
import com.in.entity.Emailsendinfo;


/**
 * 邮件发送信息表
 * */
public interface EmailsendinfoDao {
	
	//添加邮件信息
	public void addEmailsendinfo(Emailsendinfo emailSend);
					
	//修改邮件信息
	public void updateEmailsendinfo(Emailsendinfo emailSend);
					
	//删除邮件信息
	public void deleteEmailsendinfo(Integer id);
					
	//根据ID查找对象
	public Emailsendinfo findById(Integer id);
					
	//查询数据行数
	public int findAll(); 
					
	//分页查询（根据那么查询）
	public List<Emailsendinfo> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
}
