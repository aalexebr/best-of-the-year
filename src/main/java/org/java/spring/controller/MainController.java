package org.java.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.java.spring.pojo.Movie;
import org.java.spring.pojo.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController extends MainControllerFunctions{
	
	public String Movies;
	
	@GetMapping("/")
	public String home(Model model) {
		String x = "alex";
		model.addAttribute("x", x);
		
		return "home";
	}
	
	@GetMapping("/movies")
	public String movie(Model model) {
		List <Movie> movieList = getMovieList();
		String movieStringList = getMovieListAsString(movieList);
		
		
		model.addAttribute("x", movieStringList);
		return "movies";
	}
	
	@GetMapping("/songs")
	public String songs(Model model) {
		List <Song> movieList = getSongList();
		String movieStringList = getSongListAsString(movieList);
		model.addAttribute("x", movieStringList);
		return "songs";
	}
	
	@GetMapping("/movies/{id}")
	public String singleMovie(Model model, @PathVariable int id) {
		
		
		Movie x = getMovieFromListWithId(getMovieList(),id);
		
		model.addAttribute("movie", x);
		
		return "single-movie";
	}
	
	@GetMapping("/songs/{id}")
	public String singleSong(Model model, @PathVariable int id) {
		Song x = getSongFromListWithId(getSongList(),id);
		List <Song> movieList = getSongList();
		
		model.addAttribute("song", x);
		
		return "single-song";
	}
	

}
