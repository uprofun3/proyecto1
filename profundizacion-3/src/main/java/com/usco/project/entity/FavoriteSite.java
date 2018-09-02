package com.usco.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//Tabla que almacena los sitios favoritos de los usuarios
@Entity
@Table(name="FavoriteSite")
public class FavoriteSite implements Serializable{

	//id del sitio favorito, autogenerado
	@Id
	@GeneratedValue
	@Column(name="id", unique=true)
	private long id;
	
	//id del sitio al cual marcaron como favorito
	@Column(name="site", nullable= false)
	private long site;
	
	//id del usuario el cual marco el sitio como favorito
	@Column(name="userId", nullable= false)
	private long userId;
	
	public FavoriteSite() {
		
	}

	//Metodos getters y setters 
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
	
	
}
