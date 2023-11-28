package org.java.spring.pojo;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	
	 private String title;
	 private int id;
	 private static int counter = 1;
	 
	 public Movie(String title, int id) {
		 setTitle(title);
		 setId(id);
//		 setId(Movie.counter);
//		 setCounter();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}
	
//	private static void setCounter() {
//		Movie.counter++;
//	}
	
	 
	@Override
	public String toString() {
		return getTitle();
	}

}
