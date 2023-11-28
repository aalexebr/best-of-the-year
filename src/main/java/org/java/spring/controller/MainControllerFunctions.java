package org.java.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.java.spring.pojo.Movie;
import org.java.spring.pojo.Song;

public class MainControllerFunctions {
	
	protected String getMovieListAsString(List<Movie> list) {
		String finalStr = "";
		int counter = 0;
		for (Movie element : list) {
			if(counter == 0) {
				finalStr = element+"";
			}
			else {
				finalStr += ", "+element;
			}
		    
		    counter++;
		}
		return finalStr;
	}
	
	
	protected List<Movie> getMovieList(){
		Movie m1 = new Movie("movie1",1);
		Movie m2 = new Movie("movie2",2);
		Movie m3 = new Movie("movie3",3);
		List <Movie> movieList = new ArrayList<>();
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);
		return movieList;
	}
	
	protected Movie getMovieFromListWithId(List<Movie> list, int id) {
		
		Movie x = null;
		List <Movie> movieList = getMovieList();
		for (Movie element : movieList) {
			if(element.getId() == id) {
				x = element;
				break;
			}
		}
		
		return x;
		
	}
	
	protected String getSongListAsString(List<Song> list) {
		String finalStr = "";
		int counter = 0;
		for (Song element : list) {
			if(counter == 0) {
				finalStr = element+"";
			}
			else {
				finalStr += ", "+element;
			}
		    
		    counter++;
		}
		return finalStr;
	}
	
	
	protected List<Song> getSongList(){
		Song m1 = new Song("song1",1);
		Song m2 = new Song("song2",2);
		Song m3 = new Song("song3",3);
		List <Song> movieList = new ArrayList<>();
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);
		return movieList;
	}
	

	
	protected Song getSongFromListWithId(List<Song> list, int id) {
		
		Song x = null;
			List <Song> movieList = getSongList();
			for (Song element : movieList) {
				if(element.getId() == id) {
					x = element;
					break;
				}
			}
			
			return x;
		
	}

}
