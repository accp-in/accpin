package com.in.entity;

import java.sql.Timestamp;

/**
 * Reimburse entity. @author MyEclipse Persistence Tools
 */

public class Reimburse implements java.io.Serializable {

	// Fields

	private Integer reiId;
	private UserInfo userInfo;
	private Timestamp reiApplicationDate;
	private String reiContent;
	private Double reiMoney;
	private Integer reiType;
	private Integer reiProcessid;
	private Integer reiApproveStatus;

	// Constructors

	/** default constructor */
	public Reimburse() {
	}

	/** full constructor */
	public Reimburse(UserInfo userInfo, Timestamp reiApplicationDate,
			String reiContent, Double reiMoney, Integer reiType,
			Integer reiProcessid, Integer reiApproveStatus) {
		this.userInfo = userInfo;
		this.reiApplicationDate = reiApplicationDate;
		this.reiContent = reiContent;
		this.reiMoney = reiMoney;
		this.reiType = reiType;
		this.reiProcessid = reiProcessid;
		this.reiApproveStatus = reiApproveStatus;
	}

	// Property accessors

	public Integer getReiId() {
		return this.reiId;
	}

	public void setReiId(Integer reiId) {
		this.reiId = reiId;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Timestamp getReiApplicationDate() {
		return this.reiApplicationDate;
	}

	public void setReiApplicationDate(Timestamp reiApplicationDate) {
		this.reiApplicationDate = reiApplicationDate;
	}

	public String getReiContent() {
		return this.reiContent;
	}

	public void setReiContent(String reiContent) {
		this.reiContent = reiContent;
	}

	public Double getReiMoney() {
		return this.reiMoney;
	}

	public void setReiMoney(Double reiMoney) {
		this.reiMoney = reiMoney;
	}

	public Integer getReiType() {
		return this.reiType;
	}

	public void setReiType(Integer reiType) {
		this.reiType = reiType;
	}

	public Integer getReiProcessid() {
		return this.reiProcessid;
	}

	public void setReiProcessid(Integer reiProcessid) {
		this.reiProcessid = reiProcessid;
	}

	public Integer getReiApproveStatus() {
		return this.reiApproveStatus;
	}

	public void setReiApproveStatus(Integer reiApproveStatus) {
		this.reiApproveStatus = reiApproveStatus;
	}

}