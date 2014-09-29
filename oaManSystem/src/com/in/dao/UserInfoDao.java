package com.in.dao;

import java.util.List;

import com.in.entity.UserInfo;

public interface UserInfoDao {
	/**
	 * 多条件查询所有用户(传个对象进去,例如想查什么字段,就给对象设什么值)
	 * @param user
	 * @return
	 */
	public List<UserInfo> findAllUserBy(UserInfo userInfo);
	/**
	 * 查询所有用户
	 * @param user
	 * @return
	 */
	public List<UserInfo> findAllUser();
	/**
	 * 查找单个用户
	 * @param user
	 * @return
	 */
	public UserInfo findUserByID(int userid);
	/**
	 * 用户登录
	 * @param userName
	 * @param pwd
	 * @return
	 */
	public UserInfo login(String userName, String pwd);
	/**
	 * 根据职务id查询所有用户
	 * @return
	 */
	public List<UserInfo> selectUserByDutyid(int dutyid);
	/**
	 * 查询权限
	 * @param user
	 * @return
	 */
	public void selectPurviewInfo(UserInfo userinfo);
	/**
	 * 查询是否在职
	 * @return
	 */
	public void selectState(UserInfo userinfo);
	/**
	 * 修改用户信息
	 * @param user
	 */
	public void updateUser(UserInfo userinfo);
	/**
	 * 用户注册
	 * @param user
	 * @return int
	 */
	public void userRegister(UserInfo user);
	
	/**
	 * 删除用户
	 * @param id
	 */
    public void deleteUser(Integer id);
 /**
  * 根据id得到对象
  * @param id
  * @return
  */
  	public UserInfo getUserInfo(Integer id);

  	/**
  	 * 根据用户的id来更新
  	 * @param id
  	 * @param userinfo
  	 */
  	public void updateinfo(UserInfo userinfo);
  	/**
  	 * 获得总共有多少人
  	 * @return
  	 */
  	public long findallPerson();
  	/**
  	 * 得到分页的对象集合
  	 * @param page
  	 * @param person
  	 * @return
  	 */
  	public List<UserInfo> findpage(int page,int person);
}
