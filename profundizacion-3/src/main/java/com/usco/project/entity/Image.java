package com.usco.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//Tabla que guarda la informacion de una imagen
@Entity
@Table(name="Image")
public class Image implements Serializable{

	//id del imagen
	@Id
	@GeneratedValue
	@Column(name="id", unique=true)
	private long id;
	
	//propiedario de la imagen, guarda el id de un usuario o de un sitio
	@Column(name="owner", nullable=false)
	private long owner;
	
	//guarda la url donde se encuentra almacenada la imagen
	@Column(name="url", nullable=false)
	private String url;
	
	public Image() {
		
	}

	//getters setters
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
