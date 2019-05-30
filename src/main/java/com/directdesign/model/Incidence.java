package com.directdesign.model;

public class Incidence {

	private Long id;
	private String title;
	private String description;
	private Boolean solved;
	public String getDescription() {
		return description;
	}
	public Long getId() {
		return id;
	}
	public Boolean getSolved() {
		return solved;
	}
	public String getTitle() {
		return title;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setSolved(Boolean solved) {
		this.solved = solved;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
