package com.in.entity;

import java.sql.Timestamp;

/**
 * Emailrecinfo entity. @author MyEclipse Persistence Tools
 */

public class Emailrecinfo implements java.io.Serializable {

	// Fields

	private Integer recCid;
	private Emailattaches emailattaches;
	private UserInfo userInfoByRecReTouserid;
	private UserInfo userInfoByRecEmailFromId;
	private String recSubject;
	private String recEmailbody;
	private Timestamp recTime;

	// Constructors

	/** default constructor */
	public Emailrecinfo() {
	}

	/** minimal constructor */
	public Emailrecinfo(UserInfo userInfoByRecReTouserid,
			UserInfo userInfoByRecEmailFromId, String recSubject,
			String recEmailbody, Timestamp recTime) {
		this.userInfoByRecReTouserid = userInfoByRecReTouserid;
		this.userInfoByRecEmailFromId = userInfoByRecEmailFromId;
		this.recSubject = recSubject;
		this.recEmailbody = recEmailbody;
		this.recTime = recTime;
	}

	/** full constructor */
	public Emailrecinfo(Emailattaches emailattaches,
			UserInfo userInfoByRecReTouserid,
			UserInfo userInfoByRecEmailFromId, String recSubject,
			String recEmailbody, Timestamp recTime) {
		this.emailattaches = emailattaches;
		this.userInfoByRecReTouserid = userInfoByRecReTouserid;
		this.userInfoByRecEmailFromId = userInfoByRecEmailFromId;
		this.recSubject = recSubject;
		this.recEmailbody = recEmailbody;
		this.recTime = recTime;
	}

	// Property accessors

	public Integer getRecCid() {
		return this.recCid;
	}

	public void setRecCid(Integer recCid) {
		this.recCid = recCid;
	}

	public Emailattaches getEmailattaches() {
		return this.emailattaches;
	}

	public void setEmailattaches(Emailattaches emailattaches) {
		this.emailattaches = emailattaches;
	}

	public UserInfo getUserInfoByRecReTouserid() {
		return this.userInfoByRecReTouserid;
	}

	public void setUserInfoByRecReTouserid(UserInfo userInfoByRecReTouserid) {
		this.userInfoByRecReTouserid = userInfoByRecReTouserid;
	}

	public UserInfo getUserInfoByRecEmailFromId() {
		return this.userInfoByRecEmailFromId;
	}

	public void setUserInfoByRecEmailFromId(UserInfo userInfoByRecEmailFromId) {
		this.userInfoByRecEmailFromId = userInfoByRecEmailFromId;
	}

	public String getRecSubject() {
		return this.recSubject;
	}

	public void setRecSubject(String recSubject) {
		this.recSubject = recSubject;
	}

	public String getRecEmailbody() {
		return this.recEmailbody;
	}

	public void setRecEmailbody(String recEmailbody) {
		this.recEmailbody = recEmailbody;
	}

	public Timestamp getRecTime() {
		return this.recTime;
	}

	public void setRecTime(Timestamp recTime) {
		this.recTime = recTime;
	}

}