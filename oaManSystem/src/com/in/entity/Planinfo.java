package com.in.entity;

import java.sql.Timestamp;

/**
 * Planinfo entity. @author MyEclipse Persistence Tools
 */

public class Planinfo implements java.io.Serializable {

	// Fields

	private Integer planId;
	private UserInfo userInfoByUserCanyuUserid;
	private UserInfo userInfoByUserZhixingUserid;
	private String planTitle;
	private String planContent;
	private Timestamp planStarttime;
	private Timestamp planEndtime;
	private String planContentdetail;
	private Integer planRemind;
	private String planPlug;

	// Constructors

	/** default constructor */
	public Planinfo() {
	}

	/** minimal constructor */
	public Planinfo(String planTitle, String planContent) {
		this.planTitle = planTitle;
		this.planContent = planContent;
	}

	/** full constructor */
	public Planinfo(UserInfo userInfoByUserCanyuUserid,
			UserInfo userInfoByUserZhixingUserid, String planTitle,
			String planContent, Timestamp planStarttime, Timestamp planEndtime,
			String planContentdetail, Integer planRemind, String planPlug) {
		this.userInfoByUserCanyuUserid = userInfoByUserCanyuUserid;
		this.userInfoByUserZhixingUserid = userInfoByUserZhixingUserid;
		this.planTitle = planTitle;
		this.planContent = planContent;
		this.planStarttime = planStarttime;
		this.planEndtime = planEndtime;
		this.planContentdetail = planContentdetail;
		this.planRemind = planRemind;
		this.planPlug = planPlug;
	}

	// Property accessors

	public Integer getPlanId() {
		return this.planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public UserInfo getUserInfoByUserCanyuUserid() {
		return this.userInfoByUserCanyuUserid;
	}

	public void setUserInfoByUserCanyuUserid(UserInfo userInfoByUserCanyuUserid) {
		this.userInfoByUserCanyuUserid = userInfoByUserCanyuUserid;
	}

	public UserInfo getUserInfoByUserZhixingUserid() {
		return this.userInfoByUserZhixingUserid;
	}

	public void setUserInfoByUserZhixingUserid(
			UserInfo userInfoByUserZhixingUserid) {
		this.userInfoByUserZhixingUserid = userInfoByUserZhixingUserid;
	}

	public String getPlanTitle() {
		return this.planTitle;
	}

	public void setPlanTitle(String planTitle) {
		this.planTitle = planTitle;
	}

	public String getPlanContent() {
		return this.planContent;
	}

	public void setPlanContent(String planContent) {
		this.planContent = planContent;
	}

	public Timestamp getPlanStarttime() {
		return this.planStarttime;
	}

	public void setPlanStarttime(Timestamp planStarttime) {
		this.planStarttime = planStarttime;
	}

	public Timestamp getPlanEndtime() {
		return this.planEndtime;
	}

	public void setPlanEndtime(Timestamp planEndtime) {
		this.planEndtime = planEndtime;
	}

	public String getPlanContentdetail() {
		return this.planContentdetail;
	}

	public void setPlanContentdetail(String planContentdetail) {
		this.planContentdetail = planContentdetail;
	}

	public Integer getPlanRemind() {
		return this.planRemind;
	}

	public void setPlanRemind(Integer planRemind) {
		this.planRemind = planRemind;
	}

	public String getPlanPlug() {
		return this.planPlug;
	}

	public void setPlanPlug(String planPlug) {
		this.planPlug = planPlug;
	}

}