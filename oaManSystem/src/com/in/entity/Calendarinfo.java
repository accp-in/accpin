package com.in.entity;

import java.sql.Timestamp;

/**
 * Calendarinfo entity. @author MyEclipse Persistence Tools
 */

public class Calendarinfo implements java.io.Serializable {

	// Fields

	private Integer calId;
	private String calTitle;
	private String calWarntime;
	private Timestamp calStartime;
	private Timestamp calDatetime;
	private Integer calUserid;
	private String calContent;
	private Integer calType;

	// Constructors

	/** default constructor */
	public Calendarinfo() {
	}

	/** minimal constructor */
	public Calendarinfo(String calTitle, String calWarntime,
			Timestamp calStartime, Integer calUserid, String calContent) {
		this.calTitle = calTitle;
		this.calWarntime = calWarntime;
		this.calStartime = calStartime;
		this.calUserid = calUserid;
		this.calContent = calContent;
	}

	/** full constructor */
	public Calendarinfo(String calTitle, String calWarntime,
			Timestamp calStartime, Timestamp calDatetime, Integer calUserid,
			String calContent, Integer calType) {
		this.calTitle = calTitle;
		this.calWarntime = calWarntime;
		this.calStartime = calStartime;
		this.calDatetime = calDatetime;
		this.calUserid = calUserid;
		this.calContent = calContent;
		this.calType = calType;
	}

	// Property accessors

	public Integer getCalId() {
		return this.calId;
	}

	public void setCalId(Integer calId) {
		this.calId = calId;
	}

	public String getCalTitle() {
		return this.calTitle;
	}

	public void setCalTitle(String calTitle) {
		this.calTitle = calTitle;
	}

	public String getCalWarntime() {
		return this.calWarntime;
	}

	public void setCalWarntime(String calWarntime) {
		this.calWarntime = calWarntime;
	}

	public Timestamp getCalStartime() {
		return this.calStartime;
	}

	public void setCalStartime(Timestamp calStartime) {
		this.calStartime = calStartime;
	}

	public Timestamp getCalDatetime() {
		return this.calDatetime;
	}

	public void setCalDatetime(Timestamp calDatetime) {
		this.calDatetime = calDatetime;
	}

	public Integer getCalUserid() {
		return this.calUserid;
	}

	public void setCalUserid(Integer calUserid) {
		this.calUserid = calUserid;
	}

	public String getCalContent() {
		return this.calContent;
	}

	public void setCalContent(String calContent) {
		this.calContent = calContent;
	}

	public Integer getCalType() {
		return this.calType;
	}

	public void setCalType(Integer calType) {
		this.calType = calType;
	}

}