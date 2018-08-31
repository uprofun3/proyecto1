package com.usco.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TimeTable")
public class TimeTable implements Serializable{

	@Id
	@GeneratedValue
	@Column(name="id", unique=true)
	private long id;
	
	@Column(name="site", nullable=false)
	private long site;
	
	@Column(name="initial_day", nullable=false)
	private byte initialDay;
	
	@Column(name="final_day", nullable=false)
	private byte finalDay;
	
	@Column(name="open_hour", nullable=false)
	private byte openHour;
	
	@Column(name="closed_hour", nullable=false)
	private byte closedHour;
	
	public TimeTable() {
		
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

	public byte getInitialDay() {
		return initialDay;
	}

	public void setInitialDay(byte initialDay) {
		this.initialDay = initialDay;
	}

	public byte getFinalDay() {
		return finalDay;
	}

	public void setFinalDay(byte finalDay) {
		this.finalDay = finalDay;
	}

	public byte getOpenHour() {
		return openHour;
	}

	public void setOpenHour(byte openHour) {
		this.openHour = openHour;
	}

	public byte getClosedHour() {
		return closedHour;
	}

	public void setClosedHour(byte closedHour) {
		this.closedHour = closedHour;
	}
	
	
}
