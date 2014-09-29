package com.in.entity;

import java.sql.Timestamp;

/**
 * Leave entity. @author MyEclipse Persistence Tools
 */

public class Leave implements java.io.Serializable {

	// Fields

	private Integer leaId;
	private UserInfo userInfo;
	private Timestamp leaApplicationDate;
	private Timestamp leaStartDate;
	private Timestamp leaEndDate;
	private String leaContent;
	private Integer leaType;
	private Integer leaProcessid;
	private Integer leaApprovestatus;
	private String leaApproveContent;
	private Timestamp leaApproveDate;

	// Constructors

	/** default constructor */
	public Leave() {
	}

	/** full constructor */
	public Leave(UserInfo userInfo, Timestamp leaApplicationDate,
			Timestamp leaStartDate, Timestamp leaEndDate, String leaContent,
			Integer leaType, Integer leaProcessid, Integer leaApprovestatus,
			String leaApproveContent, Timestamp leaApproveDate) {
		this.userInfo = userInfo;
		this.leaApplicationDate = leaApplicationDate;
		this.leaStartDate = leaStartDate;
		this.leaEndDate = leaEndDate;
		this.leaContent = leaContent;
		this.leaType = leaType;
		this.leaProcessid = leaProcessid;
		this.leaApprovestatus = leaApprovestatus;
		this.leaApproveContent = leaApproveContent;
		this.leaApproveDate = leaApproveDate;
	}

	// Property accessors

	public Integer getLeaId() {
		return this.leaId;
	}

	public void setLeaId(Integer leaId) {
		this.leaId = leaId;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Timestamp getLeaApplicationDate() {
		return this.leaApplicationDate;
	}

	public void setLeaApplicationDate(Timestamp leaApplicationDate) {
		this.leaApplicationDate = leaApplicationDate;
	}

	public Timestamp getLeaStartDate() {
		return this.leaStartDate;
	}

	public void setLeaStartDate(Timestamp leaStartDate) {
		this.leaStartDate = leaStartDate;
	}

	public Timestamp getLeaEndDate() {
		return this.leaEndDate;
	}

	public void setLeaEndDate(Timestamp leaEndDate) {
		this.leaEndDate = leaEndDate;
	}

	public String getLeaContent() {
		return this.leaContent;
	}

	public void setLeaContent(String leaContent) {
		this.leaContent = leaContent;
	}

	public Integer getLeaType() {
		return this.leaType;
	}

	public void setLeaType(Integer leaType) {
		this.leaType = leaType;
	}

	public Integer getLeaProcessid() {
		return this.leaProcessid;
	}

	public void setLeaProcessid(Integer leaProcessid) {
		this.leaProcessid = leaProcessid;
	}

	public Integer getLeaApprovestatus() {
		return this.leaApprovestatus;
	}

	public void setLeaApprovestatus(Integer leaApprovestatus) {
		this.leaApprovestatus = leaApprovestatus;
	}

	public String getLeaApproveContent() {
		return this.leaApproveContent;
	}

	public void setLeaApproveContent(String leaApproveContent) {
		this.leaApproveContent = leaApproveContent;
	}

	public Timestamp getLeaApproveDate() {
		return this.leaApproveDate;
	}

	public void setLeaApproveDate(Timestamp leaApproveDate) {
		this.leaApproveDate = leaApproveDate;
	}

}