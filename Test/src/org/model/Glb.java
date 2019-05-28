package org.model;

/**
 * Glb entity. @author MyEclipse Persistence Tools
 */

public class Glb implements java.io.Serializable {

	// Fields

	private String glh;
	private String glm;

	// Constructors

	/** default constructor */
	public Glb() {
	}

	/** minimal constructor */
	public Glb(String glh) {
		this.glh = glh;
	}

	/** full constructor */
	public Glb(String glh, String glm) {
		this.glh = glh;
		this.glm = glm;
	}

	// Property accessors

	public String getGlh() {
		return this.glh;
	}

	public void setGlh(String glh) {
		this.glh = glh;
	}

	public String getGlm() {
		return this.glm;
	}

	public void setGlm(String glm) {
		this.glm = glm;
	}

}