package com.in.entity;

import java.sql.Timestamp;

/**
 * Notice entity. @author MyEclipse Persistence Tools
 */

public class Notice implements java.io.Serializable {

	// Fields

	private Integer noticId;
	private Integer noticType;
	private String noticTitle;
	private String noticContent;
	private Timestamp noticCetime;

	// Constructors

	/** default constructor */
	public Notice() {
	}

	/** full constructor */
	public Notice(Integer noticType, String noticTitle, String noticContent,
			Timestamp noticCetime) {
		this.noticType = noticType;
		this.noticTitle = noticTitle;
		this.noticContent = noticContent;
		this.noticCetime = noticCetime;
	}

	// Property accessors

	public Integer getNoticId() {
		return this.noticId;
	}

	public void setNoticId(Integer noticId) {
		this.noticId = noticId;
	}

	public Integer getNoticType() {
		return this.noticType;
	}

	public void setNoticType(Integer noticType) {
		this.noticType = noticType;
	}

	public String getNoticTitle() {
		return this.noticTitle;
	}

	public void setNoticTitle(String noticTitle) {
		this.noticTitle = noticTitle;
	}

	public String getNoticContent() {
		return this.noticContent;
	}

	public void setNoticContent(String noticContent) {
		this.noticContent = noticContent;
	}

	public Timestamp getNoticCetime() {
		return this.noticCetime;
	}

	public void setNoticCetime(Timestamp noticCetime) {
		this.noticCetime = noticCetime;
	}

}