package com.usco.project.model;

import com.usco.project.entity.Calification;

public class MCalification {

	private long id;
	private long site;
	private long userId;
	private float calification;
	
	public MCalification() {
		
	}
	
	public MCalification(Calification calification) {
		this.id = calification.getId();
		this.site = calification.getSite();
		this.userId = calification.getUserId();
		this.calification = calification.getCalification();
	}

	public MCalification(long id, long site, long userId, float calification) {
		super();
		this.id = id;
		this.site = site;
		this.userId = userId;
		this.calification = calification;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getSite() {
		return site;
	}

	public void setSite(long site) {
		this.site = site;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public float getCalification() {
		return calification;
	}

	public void setCalification(float calification) {
		this.calification = calification;
	}
	
	
}
