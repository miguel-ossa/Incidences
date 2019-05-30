package com.directdesign.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Solution {

	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	private String description;
	
	public String getDescription() {
		return description;
	}
	public Long getId() {
		return id;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

}
