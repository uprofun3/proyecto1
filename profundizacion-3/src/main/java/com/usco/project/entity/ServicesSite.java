package com.usco.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Services_Site")
public class ServicesSite implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="service_site_id", unique=true)
	private long id;
	
	@ManyToOne
	private Site site;
	
	@ManyToOne
	private Service service;

	public ServicesSite(long id) {
		this.id = id;
	}
	
	
	public ServicesSite() {
		
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Site getSite() {
		return site;
	}


	public void setSite(Site site) {
		this.site = site;
	}


	public Service getService() {
		return service;
	}


	public void setService(Service service) {
		this.service = service;
	}
	
	
	
}