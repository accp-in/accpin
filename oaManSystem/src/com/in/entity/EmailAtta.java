package com.in.entity;

/**
 * EmailAtta entity. @author MyEclipse Persistence Tools
 */

public class EmailAtta implements java.io.Serializable {

	// Fields

	private Integer attaId;
	private Email email;
	private String attaFilename;
	private String attaFoldername;

	// Constructors

	/** default constructor */
	public EmailAtta() {
	}

	/** minimal constructor */
	public EmailAtta(Email email) {
		this.email = email;
	}

	/** full constructor */
	public EmailAtta(Email email, String attaFilename, String attaFoldername) {
		this.email = email;
		this.attaFilename = attaFilename;
		this.attaFoldername = attaFoldername;
	}

	// Property accessors

	public Integer getAttaId() {
		return this.attaId;
	}

	public void setAttaId(Integer attaId) {
		this.attaId = attaId;
	}

	public Email getEmail() {
		return this.email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public String getAttaFilename() {
		return this.attaFilename;
	}

	public void setAttaFilename(String attaFilename) {
		this.attaFilename = attaFilename;
	}

	public String getAttaFoldername() {
		return this.attaFoldername;
	}

	public void setAttaFoldername(String attaFoldername) {
		this.attaFoldername = attaFoldername;
	}

}