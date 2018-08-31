package com.usco.project.model;

import com.usco.project.entity.FavoriteSite;

public class MFavoriteSite {

	private long id;
	private long site;
	private long userId;
	
	public MFavoriteSite() {
		
	}
	
	public MFavoriteSite(FavoriteSite favoriteSite) {
		
		this.id = favoriteSite.getId();
		this.site = favoriteSite.getSite();
		this.userId = favoriteSite.getUserId();
	}

	public MFavoriteSite(long id, long site, long userId) {
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
