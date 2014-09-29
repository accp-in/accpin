package com.in.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */

public class UserInfo implements java.io.Serializable {

	// Fields

	private Integer userUserid;
	private Department department;
	private Duty duty;
	private String userLoginname;
	private String userPassword;
	private String planPurid;
	private Integer userState;
	private Set emailsendinfosForSendSendtoid = new HashSet(0);
	private Set planinfosForUserZhixingUserid = new HashSet(0);
	private Set leaves = new HashSet(0);
	private Set emailsForEmailTowho = new HashSet(0);
	private Set messageinfosForMsgReceiveid = new HashSet(0);
	private Set emailrecinfosForRecReTouserid = new HashSet(0);
	private Set emailrecinfosForRecEmailFromId = new HashSet(0);
	private Set addresslists = new HashSet(0);
	private Set reimburses = new HashSet(0);
	private Set attendances = new HashSet(0);
	private Set emailsForEmailWho = new HashSet(0);
	private Set planinfosForUserCanyuUserid = new HashSet(0);
	private Set emailsendinfosForSendId = new HashSet(0);
	private Set messageinfosForMsgSendid = new HashSet(0);
	private Set emailattacheses = new HashSet(0);

	// Constructors

	/** default constructor */
	public UserInfo() {
	}

	/** full constructor */
	public UserInfo(Department department, Duty duty, String userLoginname,
			String userPassword, String planPurid, Integer userState,
			Set emailsendinfosForSendSendtoid,
			Set planinfosForUserZhixingUserid, Set leaves,
			Set emailsForEmailTowho, Set messageinfosForMsgReceiveid,
			Set emailrecinfosForRecReTouserid,
			Set emailrecinfosForRecEmailFromId, Set addresslists,
			Set reimburses, Set attendances, Set emailsForEmailWho,
			Set planinfosForUserCanyuUserid, Set emailsendinfosForSendId,
			Set messageinfosForMsgSendid, Set emailattacheses) {
		this.department = department;
		this.duty = duty;
		this.userLoginname = userLoginname;
		this.userPassword = userPassword;
		this.planPurid = planPurid;
		this.userState = userState;
		this.emailsendinfosForSendSendtoid = emailsendinfosForSendSendtoid;
		this.planinfosForUserZhixingUserid = planinfosForUserZhixingUserid;
		this.leaves = leaves;
		this.emailsForEmailTowho = emailsForEmailTowho;
		this.messageinfosForMsgReceiveid = messageinfosForMsgReceiveid;
		this.emailrecinfosForRecReTouserid = emailrecinfosForRecReTouserid;
		this.emailrecinfosForRecEmailFromId = emailrecinfosForRecEmailFromId;
		this.addresslists = addresslists;
		this.reimburses = reimburses;
		this.attendances = attendances;
		this.emailsForEmailWho = emailsForEmailWho;
		this.planinfosForUserCanyuUserid = planinfosForUserCanyuUserid;
		this.emailsendinfosForSendId = emailsendinfosForSendId;
		this.messageinfosForMsgSendid = messageinfosForMsgSendid;
		this.emailattacheses = emailattacheses;
	}

	// Property accessors

	public Integer getUserUserid() {
		return this.userUserid;
	}

	public void setUserUserid(Integer userUserid) {
		this.userUserid = userUserid;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Duty getDuty() {
		return this.duty;
	}

	public void setDuty(Duty duty) {
		this.duty = duty;
	}

	public String getUserLoginname() {
		return this.userLoginname;
	}

	public void setUserLoginname(String userLoginname) {
		this.userLoginname = userLoginname;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getPlanPurid() {
		return this.planPurid;
	}

	public void setPlanPurid(String planPurid) {
		this.planPurid = planPurid;
	}

	public Integer getUserState() {
		return this.userState;
	}

	public void setUserState(Integer userState) {
		this.userState = userState;
	}

	public Set getEmailsendinfosForSendSendtoid() {
		return this.emailsendinfosForSendSendtoid;
	}

	public void setEmailsendinfosForSendSendtoid(
			Set emailsendinfosForSendSendtoid) {
		this.emailsendinfosForSendSendtoid = emailsendinfosForSendSendtoid;
	}

	public Set getPlaninfosForUserZhixingUserid() {
		return this.planinfosForUserZhixingUserid;
	}

	public void setPlaninfosForUserZhixingUserid(
			Set planinfosForUserZhixingUserid) {
		this.planinfosForUserZhixingUserid = planinfosForUserZhixingUserid;
	}

	public Set getLeaves() {
		return this.leaves;
	}

	public void setLeaves(Set leaves) {
		this.leaves = leaves;
	}

	public Set getEmailsForEmailTowho() {
		return this.emailsForEmailTowho;
	}

	public void setEmailsForEmailTowho(Set emailsForEmailTowho) {
		this.emailsForEmailTowho = emailsForEmailTowho;
	}

	public Set getMessageinfosForMsgReceiveid() {
		return this.messageinfosForMsgReceiveid;
	}

	public void setMessageinfosForMsgReceiveid(Set messageinfosForMsgReceiveid) {
		this.messageinfosForMsgReceiveid = messageinfosForMsgReceiveid;
	}

	public Set getEmailrecinfosForRecReTouserid() {
		return this.emailrecinfosForRecReTouserid;
	}

	public void setEmailrecinfosForRecReTouserid(
			Set emailrecinfosForRecReTouserid) {
		this.emailrecinfosForRecReTouserid = emailrecinfosForRecReTouserid;
	}

	public Set getEmailrecinfosForRecEmailFromId() {
		return this.emailrecinfosForRecEmailFromId;
	}

	public void setEmailrecinfosForRecEmailFromId(
			Set emailrecinfosForRecEmailFromId) {
		this.emailrecinfosForRecEmailFromId = emailrecinfosForRecEmailFromId;
	}

	public Set getAddresslists() {
		return this.addresslists;
	}

	public void setAddresslists(Set addresslists) {
		this.addresslists = addresslists;
	}

	public Set getReimburses() {
		return this.reimburses;
	}

	public void setReimburses(Set reimburses) {
		this.reimburses = reimburses;
	}

	public Set getAttendances() {
		return this.attendances;
	}

	public void setAttendances(Set attendances) {
		this.attendances = attendances;
	}

	public Set getEmailsForEmailWho() {
		return this.emailsForEmailWho;
	}

	public void setEmailsForEmailWho(Set emailsForEmailWho) {
		this.emailsForEmailWho = emailsForEmailWho;
	}

	public Set getPlaninfosForUserCanyuUserid() {
		return this.planinfosForUserCanyuUserid;
	}

	public void setPlaninfosForUserCanyuUserid(Set planinfosForUserCanyuUserid) {
		this.planinfosForUserCanyuUserid = planinfosForUserCanyuUserid;
	}

	public Set getEmailsendinfosForSendId() {
		return this.emailsendinfosForSendId;
	}

	public void setEmailsendinfosForSendId(Set emailsendinfosForSendId) {
		this.emailsendinfosForSendId = emailsendinfosForSendId;
	}

	public Set getMessageinfosForMsgSendid() {
		return this.messageinfosForMsgSendid;
	}

	public void setMessageinfosForMsgSendid(Set messageinfosForMsgSendid) {
		this.messageinfosForMsgSendid = messageinfosForMsgSendid;
	}

	public Set getEmailattacheses() {
		return this.emailattacheses;
	}

	public void setEmailattacheses(Set emailattacheses) {
		this.emailattacheses = emailattacheses;
	}

}