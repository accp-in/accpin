package com.in.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.in.dao.UserInfoDao;
import com.in.entity.UserInfo;

public class UserInfoDaoImpl extends HibernateDaoSupport implements UserInfoDao {

	@Override
	public List<UserInfo> findAllUserBy(UserInfo userInfo) {
		return super.getHibernateTemplate().findByExample(userInfo);
	}

	@Override
	public List<UserInfo> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfo findUserByID(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfo login(String userName, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserInfo> selectUserByDutyid(int dutyid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectPurviewInfo(UserInfo userinfo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectState(UserInfo userinfo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(UserInfo userinfo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void userRegister(UserInfo user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserInfo getUserInfo(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long findallPerson() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UserInfo> findpage(int page, int person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateinfo(UserInfo userinfo) {
		// TODO Auto-generated method stub
		
	}

}
