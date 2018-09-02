package com.usco.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//Se crea una entidad la cual creara una tabla llamada Calificacion en la base de datos
//Esta tabla guardara todas las calificaciones que han hechos los usuarios a determinado sitio
@Entity
@Table(name="Calification")
public class Calification implements Serializable{

	//Columna id que se autogenera 
	@Id
	@GeneratedValue
	@Column(name="id", unique=true)
	private long id;
	
	//Columna site que almacenara el id del sitio que se califico, sera de tipo not null
	@Column(name="site", nullable=false)
	private long site;
	
	//Columna userId que almacenara el id del usuario que califico, sera de tipo not null
	@Column(name="userId", nullable=false)
	private long userId;
	
	//Columna calificacion que guardara la calificacion hecha por er usuario
	@Column(name="calification", nullable=false)
	private float calification;
	
	
	public Calification () {
		
	}
	
	
	//Metodos Getters y Setters para cada atributo
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

	public void setUser(long userId) {
		this.userId = userId;
	}

	public float getCalification() {
		return calification;
	}

	public void setCalification(float calification) {
		this.calification = calification;
	}
	
	
}
