package com.in.dao;

import java.util.List;

import com.in.entity.UserInfo;

public interface UserInfoDao {
	/**
	 * ��������ѯ�����û�(���������ȥ,�������ʲô�ֶ�,�͸�������ʲôֵ)
	 * @param user
	 * @return
	 */
	public List<UserInfo> findAllUserBy(UserInfo userInfo);
	/**
	 * ��ѯ�����û�
	 * @param user
	 * @return
	 */
	public List<UserInfo> findAllUser();
	/**
	 * ���ҵ����û�
	 * @param user
	 * @return
	 */
	public UserInfo findUserByID(int userid);
	/**
	 * �û���¼
	 * @param userName
	 * @param pwd
	 * @return
	 */
	public UserInfo login(String userName, String pwd);
	/**
	 * ����ְ��id��ѯ�����û�
	 * @return
	 */
	public List<UserInfo> selectUserByDutyid(int dutyid);
	/**
	 * ��ѯȨ��
	 * @param user
	 * @return
	 */
	public void selectPurviewInfo(UserInfo userinfo);
	/**
	 * ��ѯ�Ƿ���ְ
	 * @return
	 */
	public void selectState(UserInfo userinfo);
	/**
	 * �޸��û���Ϣ
	 * @param user
	 */
	public void updateUser(UserInfo userinfo);
	/**
	 * �û�ע��
	 * @param user
	 * @return int
	 */
	public void userRegister(UserInfo user);
	
	/**
	 * ɾ���û�
	 * @param id
	 */
    public void deleteUser(Integer id);
 /**
  * ����id�õ�����
  * @param id
  * @return
  */
  	public UserInfo getUserInfo(Integer id);

  	/**
  	 * �����û���id������
  	 * @param id
  	 * @param userinfo
  	 */
  	public void updateinfo(UserInfo userinfo);
  	/**
  	 * ����ܹ��ж�����
  	 * @return
  	 */
  	public long findallPerson();
  	/**
  	 * �õ���ҳ�Ķ��󼯺�
  	 * @param page
  	 * @param person
  	 * @return
  	 */
  	public List<UserInfo> findpage(int page,int person);
}
