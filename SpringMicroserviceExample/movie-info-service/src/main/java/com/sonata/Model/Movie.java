package com.sonata.Model;

public class Movie {
	public Movie(){}
public Movie(String movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}
private String movieId;
private String name;
public String getMovieId() {
	return movieId;
}
public void setMovieId(String movieId) {
	this.movieId = movieId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
