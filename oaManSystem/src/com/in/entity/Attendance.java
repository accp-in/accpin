package com.in.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Attendance entity. @author MyEclipse Persistence Tools
 */

public class Attendance implements java.io.Serializable {

	// Fields

	private Integer attId;
	private UserInfo userInfo;
	private String attCurrentDate;
	private Timestamp attOnDate;
	private Timestamp attOffDate;
	private Integer attStatus;
	private Set attendanceExplains = new HashSet(0);

	// Constructors

	/** default constructor */
	public Attendance() {
	}

	/** minimal constructor */
	public Attendance(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	/** full constructor */
	public Attendance(UserInfo userInfo, String attCurrentDate,
			Timestamp attOnDate, Timestamp attOffDate, Integer attStatus,
			Set attendanceExplains) {
		this.userInfo = userInfo;
		this.attCurrentDate = attCurrentDate;
		this.attOnDate = attOnDate;
		this.attOffDate = attOffDate;
		this.attStatus = attStatus;
		this.attendanceExplains = attendanceExplains;
	}

	// Property accessors

	public Integer getAttId() {
		return this.attId;
	}

	public void setAttId(Integer attId) {
		this.attId = attId;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public String getAttCurrentDate() {
		return this.attCurrentDate;
	}

	public void setAttCurrentDate(String attCurrentDate) {
		this.attCurrentDate = attCurrentDate;
	}

	public Timestamp getAttOnDate() {
		return this.attOnDate;
	}

	public void setAttOnDate(Timestamp attOnDate) {
		this.attOnDate = attOnDate;
	}

	public Timestamp getAttOffDate() {
		return this.attOffDate;
	}

	public void setAttOffDate(Timestamp attOffDate) {
		this.attOffDate = attOffDate;
	}

	public Integer getAttStatus() {
		return this.attStatus;
	}

	public void setAttStatus(Integer attStatus) {
		this.attStatus = attStatus;
	}

	public Set getAttendanceExplains() {
		return this.attendanceExplains;
	}

	public void setAttendanceExplains(Set attendanceExplains) {
		this.attendanceExplains = attendanceExplains;
	}

}