package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue
	@JsonIgnore
	int id ;
	
	String imageurl ;
	String name ;
	String snippet ;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getimageurl() {
		return imageurl;
	}
	
	public void setimageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSnippet() {
		return snippet;
	}
	
	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", imageurl=" + imageurl + ", name=" + name + ", snippet=" + snippet + "]";
	}
	
	
	

}
