package com.usco.project.model;

import com.usco.project.entity.Image;

public class MImage {

	private long id;
	private long owner;
	private String url;
	
	public MImage() {
		
	}
	
	public MImage(Image image) {
		
		this.id = image.getId();
		this.owner = image.getOwner();
		this.url = image.getUrl();
	}

	public MImage(long id, long owner, String url) {
		super();
		this.id = id;
		this.owner = owner;
		this.url = url;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getOwner() {
		return owner;
	}

	public void setOwner(long owner) {
		this.owner = owner;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
