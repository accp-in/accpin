package com.in.entity;

/**
 * AttendanceExplain entity. @author MyEclipse Persistence Tools
 */

public class AttendanceExplain implements java.io.Serializable {

	// Fields

	private Integer expId;
	private Attendance attendance;
	private String expDesn;

	// Constructors

	/** default constructor */
	public AttendanceExplain() {
	}

	/** full constructor */
	public AttendanceExplain(Attendance attendance, String expDesn) {
		this.attendance = attendance;
		this.expDesn = expDesn;
	}

	// Property accessors

	public Integer getExpId() {
		return this.expId;
	}

	public void setExpId(Integer expId) {
		this.expId = expId;
	}

	public Attendance getAttendance() {
		return this.attendance;
	}

	public void setAttendance(Attendance attendance) {
		this.attendance = attendance;
	}

	public String getExpDesn() {
		return this.expDesn;
	}

	public void setExpDesn(String expDesn) {
		this.expDesn = expDesn;
	}

}