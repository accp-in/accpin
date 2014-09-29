package com.in.service.impl;

import java.util.List;

import com.in.dao.UserInfoDao;
import com.in.entity.UserInfo;
import com.in.service.UserInfoService;

public class UserInfoServiceImpl implements UserInfoService {
	
	private UserInfoDao userInfoDao;
	
	@Override
	public UserInfo login(UserInfo userInfo) throws Exception {
		List<UserInfo> userList=userInfoDao.findAllUserBy(userInfo);
		if(userList.size()>0){
			return userList.get(0);
		}
		return null;
	}
	
		
	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	@Override
	public List<UserInfo> findAllUserBy(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return null;
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
	public void updateinfo(int id, UserInfo userinfo) {
		// TODO Auto-generated method stub
		
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
	public UserInfo getDepartmentMessage(UserInfo user) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public UserInfo getGeneralMessage(UserInfo user) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public UserInfo getCashier(UserInfo user) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public UserInfo getPersonnel(UserInfo user) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
