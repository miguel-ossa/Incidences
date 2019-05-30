package com.directdesign.model;


import java.time.LocalDateTime;

import javax.persistence.Entity;

import com.sun.istack.NotNull;

@Entity
public class Auditing {

	@NotNull
	private Long 			createdBy;

	@NotNull
	private LocalDateTime 	createdDate;
	
	@NotNull
	private Long 		  	lastModifiedBy;
	
	@NotNull
	private LocalDateTime 	lastModifiedDate;
	
	public Long getCreatedBy() {
		return createdBy;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public Long getLastModifiedBy() {
		return lastModifiedBy;
	}
	public LocalDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public void setLastModifiedBy(Long lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
}
