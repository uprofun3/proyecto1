package com.usco.project.model;

import com.usco.project.entity.Site;

public class MSite {

	private long id;
	private String name;
	private String address;
	private String city;
	private String latitude;
	private String longitude;
	private String phoneNumber;
	private String eslogan;
	private String information;
	private int category;
	private float calification;
	
	public MSite() {
		
	}
	
	public MSite(Site site) {
		
		this.id = site.getId();
		this.name = site.getName();
		this.address = site.getAddress();
		this.city = site.getCity();
		this.latitude = site.getLatitude();
		this.longitude = site.getLongitude();
		this.phoneNumber = site.getPhoneNumber();
		this.eslogan = site.getEslogan();
		this.information = site.getInformation();
		this.category = site.getCategory();
		this.calification = site.getCalification();
				
	}

	public MSite(long id, String name, String address, String city, String latitude, String longitude,
			String phoneNumber, String eslogan, String information, int category, float calification) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.latitude = latitude;
		this.longitude = longitude;
		this.phoneNumber = phoneNumber;
		this.eslogan = eslogan;
		this.information = information;
		this.category = category;
		this.calification = calification;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEslogan() {
		return eslogan;
	}

	public void setEslogan(String eslogan) {
		this.eslogan = eslogan;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public float getCalification() {
		return calification;
	}

	public void setCalification(float calification) {
		this.calification = calification;
	}
	
	
}
