package org.model;

import java.util.Date;

/**
 * Jsb entity. @author MyEclipse Persistence Tools
 */

public class Jsb implements java.io.Serializable {

	// Fields

	private String jsh;
	private String jsm;
	private Short xb;
	private Date cssj;
	//private Integer zyId;
	private Integer gz;
	private String bz;
	private byte[] zp;;
	private String type;
	private Zyb zyb;

	// Constructors

	/** default constructor */
	public Jsb() {
	}

	/** minimal constructor */
	public Jsb(String jsh, String jsm, Short xb, String type) {
		this.jsh = jsh;
		this.jsm = jsm;
		this.xb = xb;
		//this.zyId = zyId;
		this.type = type;
	}

	/** full constructor */
	public Jsb(String jsh, String jsm, Short xb, Date cssj, Integer gz, String bz, byte[] zp,
			String type, Zyb zyb) {
		this.jsh = jsh;
		this.jsm = jsm;
		this.xb = xb;
		this.cssj = cssj;
		//this.zyId = zyId;
		this.gz = gz;
		this.bz = bz;
		this.zp = zp;
		this.type = type;
		this.zyb=zyb;
	}

	// Property accessors

	public String getJsh() {
		return this.jsh;
	}

	public void setJsh(String jsh) {
		this.jsh = jsh;
	}

	public String getJsm() {
		return this.jsm;
	}

	public void setJsm(String jsm) {
		this.jsm = jsm;
	}

	public Short getXb() {
		return this.xb;
	}

	public void setXb(Short xb) {
		this.xb = xb;
	}

	public Date getCssj() {
		return this.cssj;
	}

	public void setCssj(Date cssj) {
		this.cssj = cssj;
	}

//	public Integer getZyId() {
//		return this.zyId;
//	}
//
//	public void setZyId(Integer zyId) {
//		this.zyId = zyId;
//	}

	public Integer getGz() {
		return this.gz;
	}

	public void setGz(Integer gz) {
		this.gz = gz;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public byte[] getZp() {
		return zp;
	}

	public void setZp(byte[] zp) {
		this.zp = zp;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Zyb getZyb() {
		return this.zyb;
	}

	public void setZyb(Zyb zyb) {
		this.zyb = zyb;
	}
	
}