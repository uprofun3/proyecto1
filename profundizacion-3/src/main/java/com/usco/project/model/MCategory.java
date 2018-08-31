package com.usco.project.model;

import com.usco.project.entity.Category;

public class MCategory {

	private long id;
	private String name;
	private String info;
	private String icon;
	
	public MCategory(){
		
	}
	
	public MCategory(Category category) {
		
		this.id = category.getId();
		this.name = category.getName();
		this.info = category.getInfo();
		this.icon = category.getIcon();
	}

	public MCategory(long id, String name, String info, String icon) {
		super();
		this.id = id;
		this.name = name;
		this.info = info;
		this.icon = icon;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	
}
