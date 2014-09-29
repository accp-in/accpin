package com.in.entity;

/**
 * MessageAtta entity. @author MyEclipse Persistence Tools
 */

public class MessageAtta implements java.io.Serializable {

	// Fields

	private Integer msgattaId;
	private Messageinfo messageinfo;
	private String msgattaFilename;
	private String msgattaFoldername;

	// Constructors

	/** default constructor */
	public MessageAtta() {
	}

	/** minimal constructor */
	public MessageAtta(Messageinfo messageinfo) {
		this.messageinfo = messageinfo;
	}

	/** full constructor */
	public MessageAtta(Messageinfo messageinfo, String msgattaFilename,
			String msgattaFoldername) {
		this.messageinfo = messageinfo;
		this.msgattaFilename = msgattaFilename;
		this.msgattaFoldername = msgattaFoldername;
	}

	// Property accessors

	public Integer getMsgattaId() {
		return this.msgattaId;
	}

	public void setMsgattaId(Integer msgattaId) {
		this.msgattaId = msgattaId;
	}

	public Messageinfo getMessageinfo() {
		return this.messageinfo;
	}

	public void setMessageinfo(Messageinfo messageinfo) {
		this.messageinfo = messageinfo;
	}

	public String getMsgattaFilename() {
		return this.msgattaFilename;
	}

	public void setMsgattaFilename(String msgattaFilename) {
		this.msgattaFilename = msgattaFilename;
	}

	public String getMsgattaFoldername() {
		return this.msgattaFoldername;
	}

	public void setMsgattaFoldername(String msgattaFoldername) {
		this.msgattaFoldername = msgattaFoldername;
	}

}