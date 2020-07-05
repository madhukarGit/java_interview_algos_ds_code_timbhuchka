package com.ds.algos.pojos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSortObjects {

	public static void main(String[] args) {
	
		Movies[] movies = new Movies[6];
		
		movies[0] = new Movies(1262, "Tenet");
		
		movies[1] = new Movies(1234, "Game Of Thrones");
		
		movies[2] = new Movies(976, "Lord of Rings");
		
		movies[3] = new Movies(1612, "Inception");
		
		movies[4] = new Movies(881, "Zoo Keeper");
		
		movies[5] = new Movies(889, "Andrew unnamed movie");
		
		sortNamesBubble(movies);
		
	}
	
	private static void sortNamesBubble(Movies[] movieNames) {
		
		List<Movies> movieSortList = null;
		
		for(int i =0;i<movieNames.length-1;i++) {
			for(int j=0;j<movieNames.length-i-1;j++) {
					
					if(movieNames[j].getMovieName().charAt(0) > movieNames[j+1].getMovieName().charAt(0)) {
						Movies temp = movieNames[j];
						
						movieNames[j] = movieNames[j+1];
						
						movieNames[j+1] = temp;
					}
				
			}
			
			movieSortList = Arrays.stream(movieNames).collect(Collectors.toList());
			
		}
		
		movieSortList.forEach(e->{
			System.out.println(e.getMovieDate());
			System.out.println(e.getMovieName());
		});
	}
}
