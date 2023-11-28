package org.java.spring.pojo;

public class Song {
	
	private String title;
	 private int id;
	 
	 public Song(String title, int id) {
		 setTitle(title);
		 setId(id);

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
	
	 
	@Override
	public String toString() {
		return getTitle();
	}

}
