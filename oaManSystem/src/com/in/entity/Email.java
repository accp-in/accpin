package com.in.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Email entity. @author MyEclipse Persistence Tools
 */

public class Email implements java.io.Serializable {

	// Fields

	private Integer emailId;
	private UserInfo userInfoByEmailTowho;
	private UserInfo userInfoByEmailWho;
	private String emailName;
	private String emailTitle;
	private String emailContext;
	private Integer emaillState;
	private Set emailAttas = new HashSet(0);

	// Constructors

	/** default constructor */
	public Email() {
	}

	/** minimal constructor */
	public Email(String emailTitle, String emailContext, Integer emaillState) {
		this.emailTitle = emailTitle;
		this.emailContext = emailContext;
		this.emaillState = emaillState;
	}

	/** full constructor */
	public Email(UserInfo userInfoByEmailTowho, UserInfo userInfoByEmailWho,
			String emailName, String emailTitle, String emailContext,
			Integer emaillState, Set emailAttas) {
		this.userInfoByEmailTowho = userInfoByEmailTowho;
		this.userInfoByEmailWho = userInfoByEmailWho;
		this.emailName = emailName;
		this.emailTitle = emailTitle;
		this.emailContext = emailContext;
		this.emaillState = emaillState;
		this.emailAttas = emailAttas;
	}

	// Property accessors

	public Integer getEmailId() {
		return this.emailId;
	}

	public void setEmailId(Integer emailId) {
		this.emailId = emailId;
	}

	public UserInfo getUserInfoByEmailTowho() {
		return this.userInfoByEmailTowho;
	}

	public void setUserInfoByEmailTowho(UserInfo userInfoByEmailTowho) {
		this.userInfoByEmailTowho = userInfoByEmailTowho;
	}

	public UserInfo getUserInfoByEmailWho() {
		return this.userInfoByEmailWho;
	}

	public void setUserInfoByEmailWho(UserInfo userInfoByEmailWho) {
		this.userInfoByEmailWho = userInfoByEmailWho;
	}

	public String getEmailName() {
		return this.emailName;
	}

	public void setEmailName(String emailName) {
		this.emailName = emailName;
	}

	public String getEmailTitle() {
		return this.emailTitle;
	}

	public void setEmailTitle(String emailTitle) {
		this.emailTitle = emailTitle;
	}

	public String getEmailContext() {
		return this.emailContext;
	}

	public void setEmailContext(String emailContext) {
		this.emailContext = emailContext;
	}

	public Integer getEmaillState() {
		return this.emaillState;
	}

	public void setEmaillState(Integer emaillState) {
		this.emaillState = emaillState;
	}

	public Set getEmailAttas() {
		return this.emailAttas;
	}

	public void setEmailAttas(Set emailAttas) {
		this.emailAttas = emailAttas;
	}

}