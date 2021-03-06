package com.directdesign.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Person {

	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String email;
	
	private Boolean esAdmin;
	
	@NotNull
	private String user;
	
	@NotNull
	private String password;
	
	public String getEmail() {
		return email;
	}
	public Boolean getEsAdmin() {
		return esAdmin;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getUser() {
		return user;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setEsAdmin(Boolean esAdmin) {
		this.esAdmin = esAdmin;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUser(String user) {
		this.user = user;
	}
}
