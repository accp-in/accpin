package com.in.web.action;

import java.util.HashMap;
import java.util.Map;


import com.in.entity.UserInfo;
import com.in.service.AddresslistService;
import com.in.service.UserInfoService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoAction extends BaseAction {
	private UserInfo userInfo;

	private UserInfoService userInfoService;
	
	private AddresslistService addresslistService;
	
	private int page;   //页码
	
    private int rows;    //页数(pageSize)
    
    private String title;
    
    private Map<String, Object> result = new HashMap<String, Object>();
    
    private String[] paramNames = null;
	
	private Object[] values = null;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Map<String, Object> getResult() {
		return result;
	}
	public void setResult(Map<String, Object> result) {
		this.result = result;
	}
	public void setAddresslistService(AddresslistService addresslistService) {
		this.addresslistService = addresslistService;
	}
	/**
	 * 显示登录页面
	 * @return
	 */
	public String showLogin(){
		return SUCCESS;
	}
	/**
	 * 用户登录
	 * @return
	 */
	public String login(){
		try {
			UserInfo user =userInfoService.login(userInfo);
			//验证码
//			if(!verify.equals(session.get("numrand"))){
//				addFieldError("verifyError", "验证码错误,请重新填写");
//				return INPUT;
//			}
			if(user!=null){
				session.put("user", user);
			}else{
				addFieldError("loginError", "账号密码错误,请重新登录");
				return INPUT;
			}
		} catch (Exception e) {
			e.printStackTrace();
			addFieldError("loginError", "登录错误,请联系管理员");
			return INPUT;
		}
		return SUCCESS;
	}
	
	/**
	 * 登出
	 * @return
	 */
	public String loginOut(){
		ActionContext.getContext().getSession().clear();//销毁session对象
		return SUCCESS;
	}
	
	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}
	
	
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	public String mapByPage(){
		String hql = "from Addresslist";
		System.out.println(title);
		if(title !=null ){
			hql+=" where addDuty like :addDuty";
			paramNames = new String[] {"addDuty"};
			values = new Object[]{"%"+title+"%"};
		}
		//System.out.println(addresslistService.findAll());
		//addresslistService.findByList(name, page, rows, hql, paramNames, values);
		result = addresslistService.allByPage(title, page, rows, hql, paramNames, values);
		System.out.println(result);
		return SUCCESS;
	}
	
}
