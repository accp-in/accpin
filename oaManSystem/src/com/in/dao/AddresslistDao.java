package com.in.dao;

import java.util.List;
import java.util.Map;

import com.in.entity.Addresslist;


/**
 * 通讯录表(人员履历那里可以从这里获取用户信息,只能个人查看个人和管理员查看全部)
 * */
public interface AddresslistDao {
	
	//添加通讯录信息
	public void addAddresslist(Addresslist address);
		
	//修改通讯录信息
	public void updateAddresslist(Addresslist address);
		
	//删除通讯录信息
	public void deleteAddresslist(Integer id);
		
	//根据ID查找对象
	public Addresslist findById(Integer id);
		
	//查询数据行数
	public int findAll(String title); 
		
	//分页查询（根据那么查询）
	public List<Addresslist> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
		
}
