package com.in.entity;

import java.sql.Timestamp;

/**
 * Emailsendinfo entity. @author MyEclipse Persistence Tools
 */

public class Emailsendinfo implements java.io.Serializable {

	// Fields

	private Integer sendId;
	private UserInfo userInfoBySendId;
	private UserInfo userInfoBySendSendtoid;
	private String sendSubject;
	private String sendEmailbody;
	private Integer sendUserid;
	private Integer sendIssended;
	private Timestamp sendTime;

	// Constructors

	/** default constructor */
	public Emailsendinfo() {
	}

	/** full constructor */
	public Emailsendinfo(UserInfo userInfoBySendId,
			UserInfo userInfoBySendSendtoid, String sendSubject,
			String sendEmailbody, Integer sendUserid, Integer sendIssended,
			Timestamp sendTime) {
		this.userInfoBySendId = userInfoBySendId;
		this.userInfoBySendSendtoid = userInfoBySendSendtoid;
		this.sendSubject = sendSubject;
		this.sendEmailbody = sendEmailbody;
		this.sendUserid = sendUserid;
		this.sendIssended = sendIssended;
		this.sendTime = sendTime;
	}

	// Property accessors

	public Integer getSendId() {
		return this.sendId;
	}

	public void setSendId(Integer sendId) {
		this.sendId = sendId;
	}

	public UserInfo getUserInfoBySendId() {
		return this.userInfoBySendId;
	}

	public void setUserInfoBySendId(UserInfo userInfoBySendId) {
		this.userInfoBySendId = userInfoBySendId;
	}

	public UserInfo getUserInfoBySendSendtoid() {
		return this.userInfoBySendSendtoid;
	}

	public void setUserInfoBySendSendtoid(UserInfo userInfoBySendSendtoid) {
		this.userInfoBySendSendtoid = userInfoBySendSendtoid;
	}

	public String getSendSubject() {
		return this.sendSubject;
	}

	public void setSendSubject(String sendSubject) {
		this.sendSubject = sendSubject;
	}

	public String getSendEmailbody() {
		return this.sendEmailbody;
	}

	public void setSendEmailbody(String sendEmailbody) {
		this.sendEmailbody = sendEmailbody;
	}

	public Integer getSendUserid() {
		return this.sendUserid;
	}

	public void setSendUserid(Integer sendUserid) {
		this.sendUserid = sendUserid;
	}

	public Integer getSendIssended() {
		return this.sendIssended;
	}

	public void setSendIssended(Integer sendIssended) {
		this.sendIssended = sendIssended;
	}

	public Timestamp getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(Timestamp sendTime) {
		this.sendTime = sendTime;
	}

}