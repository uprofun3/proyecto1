package com.usco.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//Tabla que guardara la informacion de los usuarios
@Entity
@Table(name="Users")
public class User implements Serializable{

	//id del usuario, autogenerado
	@Id
	@GeneratedValue
	@Column(name="id", unique=true)
	private long id;
	
	//nombre de usuario, no se puede repetir
	@Column(name="username", unique=true, nullable=false)
	private String username;
	
	//contraseña del usuario para ingresar
	@Column(name="password", nullable=false)
	private String password;
	
	//correo del usuario
	@Column(name="email", unique=true, nullable=false)
	private String email;
	
	//tipo de usaurio, (normal, administrador, dueño de un sitio)
	@Column(name="type", nullable=false)
	private String type;
	
	//nombre del usuario
	@Column(name="name", length=20, nullable=false)
	private String name;
	
	//apellido del usuario
	@Column(name="lastName", length=30)
	private String lastName;
	
	public User() {
		
	}

	//Getters y setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
	
	
	
}
