package com.usco.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Se crea una entidad la cual creara una tabla llamada Calificacion en la base de datos
//Esta tabla guardara todas las calificaciones que han hechos los usuarios a determinado sitio
@Entity
@Table(name="Calification")
public class Calification implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//comentario
	//Columna id que se autogenera 
	@Id
	@GeneratedValue
	@Column(name="id", unique=true)
	private long id;
	
	@ManyToOne
	private Site site;
	
	@ManyToOne
	private User user;
	
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


	public Site getSite() {
		return site;
	}


	public void setSite(Site site) {
		this.site = site;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public float getCalification() {
		return calification;
	}

	public void setCalification(float calification) {
		this.calification = calification;
	}
	
	
}
