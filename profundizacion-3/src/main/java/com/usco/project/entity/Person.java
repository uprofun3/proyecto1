package com.usco.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="person_id", unique=true)
	private long id;
	
	@Column(name="name", length=20, nullable=false)
	private String name;
	
	@Column(name="last_name", length=30, nullable=false)
	private String lastName;
	
	@Column(name="gender", length=15, nullable=false)
	private String gender;
	
	@Column(name="image",nullable=true)
	private String image;
		
	
	public Person () {
		
	}

	public Person(long id, String name, String lastName, String gender) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}
