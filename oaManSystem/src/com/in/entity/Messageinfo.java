package com.in.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Messageinfo entity. @author MyEclipse Persistence Tools
 */

public class Messageinfo implements java.io.Serializable {

	// Fields

	private Integer msgId;
	private UserInfo userInfoByMsgReceiveid;
	private UserInfo userInfoByMsgSendid;
	private String msgTitle;
	private String msgContent;
	private Timestamp msgAddtime;
	private Integer msgFlag;
	private Integer msgType;
	private Set messageAttas = new HashSet(0);

	// Constructors

	/** default constructor */
	public Messageinfo() {
	}

	/** minimal constructor */
	public Messageinfo(UserInfo userInfoByMsgReceiveid,
			UserInfo userInfoByMsgSendid, String msgTitle, String msgContent,
			Timestamp msgAddtime, Integer msgFlag) {
		this.userInfoByMsgReceiveid = userInfoByMsgReceiveid;
		this.userInfoByMsgSendid = userInfoByMsgSendid;
		this.msgTitle = msgTitle;
		this.msgContent = msgContent;
		this.msgAddtime = msgAddtime;
		this.msgFlag = msgFlag;
	}

	/** full constructor */
	public Messageinfo(UserInfo userInfoByMsgReceiveid,
			UserInfo userInfoByMsgSendid, String msgTitle, String msgContent,
			Timestamp msgAddtime, Integer msgFlag, Integer msgType,
			Set messageAttas) {
		this.userInfoByMsgReceiveid = userInfoByMsgReceiveid;
		this.userInfoByMsgSendid = userInfoByMsgSendid;
		this.msgTitle = msgTitle;
		this.msgContent = msgContent;
		this.msgAddtime = msgAddtime;
		this.msgFlag = msgFlag;
		this.msgType = msgType;
		this.messageAttas = messageAttas;
	}

	// Property accessors

	public Integer getMsgId() {
		return this.msgId;
	}

	public void setMsgId(Integer msgId) {
		this.msgId = msgId;
	}

	public UserInfo getUserInfoByMsgReceiveid() {
		return this.userInfoByMsgReceiveid;
	}

	public void setUserInfoByMsgReceiveid(UserInfo userInfoByMsgReceiveid) {
		this.userInfoByMsgReceiveid = userInfoByMsgReceiveid;
	}

	public UserInfo getUserInfoByMsgSendid() {
		return this.userInfoByMsgSendid;
	}

	public void setUserInfoByMsgSendid(UserInfo userInfoByMsgSendid) {
		this.userInfoByMsgSendid = userInfoByMsgSendid;
	}

	public String getMsgTitle() {
		return this.msgTitle;
	}

	public void setMsgTitle(String msgTitle) {
		this.msgTitle = msgTitle;
	}

	public String getMsgContent() {
		return this.msgContent;
	}

	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	public Timestamp getMsgAddtime() {
		return this.msgAddtime;
	}

	public void setMsgAddtime(Timestamp msgAddtime) {
		this.msgAddtime = msgAddtime;
	}

	public Integer getMsgFlag() {
		return this.msgFlag;
	}

	public void setMsgFlag(Integer msgFlag) {
		this.msgFlag = msgFlag;
	}

	public Integer getMsgType() {
		return this.msgType;
	}

	public void setMsgType(Integer msgType) {
		this.msgType = msgType;
	}

	public Set getMessageAttas() {
		return this.messageAttas;
	}

	public void setMessageAttas(Set messageAttas) {
		this.messageAttas = messageAttas;
	}

}