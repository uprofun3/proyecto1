package com.usco.project.model;

import com.usco.project.entity.TimeTable;

public class MTimeTable {

	private long id;
	private long site;
	private byte initalDay;
	private byte finalDay;
	private byte openHour;
	private byte closedHour;
	
	public MTimeTable() {
		
	}
	public MTimeTable(TimeTable timeTable) {
		
		this.id = timeTable.getId();
		this.site = timeTable.getSite();
		this.initalDay = timeTable.getInitialDay();
		this.finalDay = timeTable.getFinalDay();
		this.openHour = timeTable.getOpenHour();
		this.closedHour = timeTable.getClosedHour();
	}
	
	public MTimeTable(long id, long site, byte initalDay, byte finalDay, byte openHour, byte closedHour) {
		super();
		this.id = id;
		this.site = site;
		this.initalDay = initalDay;
		this.finalDay = finalDay;
		this.openHour = openHour;
		this.closedHour = closedHour;
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
	public byte getInitalDay() {
		return initalDay;
	}
	public void setInitalDay(byte initalDay) {
		this.initalDay = initalDay;
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
