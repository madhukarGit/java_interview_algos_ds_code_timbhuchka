package com.ds.algos.pojos;

public class Movies {

	private Integer movieDate;
	private String movieName;
	
	public Movies(Integer movieDate, String movieName) {
		this.movieDate = movieDate;
		this.movieName = movieName;
	}

	public Integer getMovieDate() {
		return movieDate;
	}

	public void setMovieDate(Integer movieDate) {
		this.movieDate = movieDate;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	
	
}
