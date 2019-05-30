package com.directdesign.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Team {

	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	private String name;

	@NotNull
	private String email;
	
	public String getEmail() {
		return email;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
}
