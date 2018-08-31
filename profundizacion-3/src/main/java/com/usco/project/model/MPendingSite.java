package com.usco.project.model;

import com.usco.project.entity.PendingSite;

public class MPendingSite {

	private long id;
	private long site;
	private long userId;
	
	public MPendingSite() {
		
	}
	
	public MPendingSite(PendingSite pendingSite) {
		
		this.id = pendingSite.getId();
		this.site = pendingSite.getSite();
		this.userId = pendingSite.getUserId();
	}

	public MPendingSite(long id, long site, long userId) {
		super();
		this.id = id;
		this.site = site;
		this.userId = userId;
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
	
	
}
