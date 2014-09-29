package com.in.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Duty entity. @author MyEclipse Persistence Tools
 */

public class Duty implements java.io.Serializable {

	// Fields

	private Integer dutyDutyid;
	private String dutyDutyname;
	private Set userInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Duty() {
	}

	/** minimal constructor */
	public Duty(String dutyDutyname) {
		this.dutyDutyname = dutyDutyname;
	}

	/** full constructor */
	public Duty(String dutyDutyname, Set userInfos) {
		this.dutyDutyname = dutyDutyname;
		this.userInfos = userInfos;
	}

	// Property accessors

	public Integer getDutyDutyid() {
		return this.dutyDutyid;
	}

	public void setDutyDutyid(Integer dutyDutyid) {
		this.dutyDutyid = dutyDutyid;
	}

	public String getDutyDutyname() {
		return this.dutyDutyname;
	}

	public void setDutyDutyname(String dutyDutyname) {
		this.dutyDutyname = dutyDutyname;
	}

	public Set getUserInfos() {
		return this.userInfos;
	}

	public void setUserInfos(Set userInfos) {
		this.userInfos = userInfos;
	}

}