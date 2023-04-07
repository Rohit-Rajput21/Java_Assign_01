package com.theatreRest.theatreRest.entities;

public class Movie {
     
	private int id;
	private String name;
	private String actorName;
	private String actressName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getActressName() {
		return actressName;
	}
	public void setActressName(String actressName) {
		this.actressName = actressName;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int id, String name, String actorName, String actressName) {
		super();
		this.id = id;
		this.name = name;
		this.actorName = actorName;
		this.actressName = actressName;
	}
	
}
