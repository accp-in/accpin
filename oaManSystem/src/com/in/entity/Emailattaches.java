package com.in.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Emailattaches entity. @author MyEclipse Persistence Tools
 */

public class Emailattaches implements java.io.Serializable {

	// Fields

	private Integer attaId;
	private UserInfo userInfo;
	private Integer attaMailid;
	private String attaFilename;
	private String attaFoldername;
	private Set emailrecinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Emailattaches() {
	}

	/** minimal constructor */
	public Emailattaches(UserInfo userInfo, Integer attaMailid,
			String attaFilename, String attaFoldername) {
		this.userInfo = userInfo;
		this.attaMailid = attaMailid;
		this.attaFilename = attaFilename;
		this.attaFoldername = attaFoldername;
	}

	/** full constructor */
	public Emailattaches(UserInfo userInfo, Integer attaMailid,
			String attaFilename, String attaFoldername, Set emailrecinfos) {
		this.userInfo = userInfo;
		this.attaMailid = attaMailid;
		this.attaFilename = attaFilename;
		this.attaFoldername = attaFoldername;
		this.emailrecinfos = emailrecinfos;
	}

	// Property accessors

	public Integer getAttaId() {
		return this.attaId;
	}

	public void setAttaId(Integer attaId) {
		this.attaId = attaId;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Integer getAttaMailid() {
		return this.attaMailid;
	}

	public void setAttaMailid(Integer attaMailid) {
		this.attaMailid = attaMailid;
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

	public Set getEmailrecinfos() {
		return this.emailrecinfos;
	}

	public void setEmailrecinfos(Set emailrecinfos) {
		this.emailrecinfos = emailrecinfos;
	}

}