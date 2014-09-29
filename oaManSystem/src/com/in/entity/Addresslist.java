package com.in.entity;

/**
 * Addresslist entity. @author MyEclipse Persistence Tools
 */

public class Addresslist implements java.io.Serializable {

	// Fields

	private Integer addBookid;
	private UserInfo userInfo;
	private String addDuty;
	private String addUnit;
	private String addOfficeaddress;
	private String addHomeaddress;
	private String addHometel;
	private String addOfficetel;
	private String addMobil;
	private String addFax;
	private String addPostcode;
	private String addEmail;
	private String addNote;

	// Constructors

	/** default constructor */
	public Addresslist() {
	}

	/** minimal constructor */
	public Addresslist(UserInfo userInfo, String addDuty, String addUnit,
			String addOfficeaddress, String addHomeaddress, String addHometel,
			String addOfficetel, String addMobil, String addFax, String addEmail) {
		this.userInfo = userInfo;
		this.addDuty = addDuty;
		this.addUnit = addUnit;
		this.addOfficeaddress = addOfficeaddress;
		this.addHomeaddress = addHomeaddress;
		this.addHometel = addHometel;
		this.addOfficetel = addOfficetel;
		this.addMobil = addMobil;
		this.addFax = addFax;
		this.addEmail = addEmail;
	}

	/** full constructor */
	public Addresslist(UserInfo userInfo, String addDuty, String addUnit,
			String addOfficeaddress, String addHomeaddress, String addHometel,
			String addOfficetel, String addMobil, String addFax,
			String addPostcode, String addEmail, String addNote) {
		this.userInfo = userInfo;
		this.addDuty = addDuty;
		this.addUnit = addUnit;
		this.addOfficeaddress = addOfficeaddress;
		this.addHomeaddress = addHomeaddress;
		this.addHometel = addHometel;
		this.addOfficetel = addOfficetel;
		this.addMobil = addMobil;
		this.addFax = addFax;
		this.addPostcode = addPostcode;
		this.addEmail = addEmail;
		this.addNote = addNote;
	}

	// Property accessors

	public Integer getAddBookid() {
		return this.addBookid;
	}

	public void setAddBookid(Integer addBookid) {
		this.addBookid = addBookid;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public String getAddDuty() {
		return this.addDuty;
	}

	public void setAddDuty(String addDuty) {
		this.addDuty = addDuty;
	}

	public String getAddUnit() {
		return this.addUnit;
	}

	public void setAddUnit(String addUnit) {
		this.addUnit = addUnit;
	}

	public String getAddOfficeaddress() {
		return this.addOfficeaddress;
	}

	public void setAddOfficeaddress(String addOfficeaddress) {
		this.addOfficeaddress = addOfficeaddress;
	}

	public String getAddHomeaddress() {
		return this.addHomeaddress;
	}

	public void setAddHomeaddress(String addHomeaddress) {
		this.addHomeaddress = addHomeaddress;
	}

	public String getAddHometel() {
		return this.addHometel;
	}

	public void setAddHometel(String addHometel) {
		this.addHometel = addHometel;
	}

	public String getAddOfficetel() {
		return this.addOfficetel;
	}

	public void setAddOfficetel(String addOfficetel) {
		this.addOfficetel = addOfficetel;
	}

	public String getAddMobil() {
		return this.addMobil;
	}

	public void setAddMobil(String addMobil) {
		this.addMobil = addMobil;
	}

	public String getAddFax() {
		return this.addFax;
	}

	public void setAddFax(String addFax) {
		this.addFax = addFax;
	}

	public String getAddPostcode() {
		return this.addPostcode;
	}

	public void setAddPostcode(String addPostcode) {
		this.addPostcode = addPostcode;
	}

	public String getAddEmail() {
		return this.addEmail;
	}

	public void setAddEmail(String addEmail) {
		this.addEmail = addEmail;
	}

	public String getAddNote() {
		return this.addNote;
	}

	public void setAddNote(String addNote) {
		this.addNote = addNote;
	}

}