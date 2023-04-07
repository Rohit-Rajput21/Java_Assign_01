package com.theatreRest.theatreRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.theatreRest.theatreRest.service.MyTheatreService;
import com.theatreRest.theatreRest.entities.Movie;

@RestController
public class MyController {
    @Autowired
	MyTheatreService service;   
	
    @GetMapping("/movies")
	public List<Movie> moviesShow(){
		return this.service.moviesShow(); 
	}
    
    @GetMapping("/movies/{movieId}")
    public Movie getMovie(@PathVariable String movieId) {
    	return this.service.getMovie(Integer.parseInt(movieId));
    }
    
    @PostMapping("/movies")
    public Movie addMovie(@RequestBody Movie movie) {
    	return this.service.addMovie(movie);
    }
    
    @PutMapping("/movies/{movieId}")
    public Movie updateMovieDetails(@RequestBody Movie movie,@PathVariable String movieId) {
    	return this.service.updateMovieDetails(movie,Integer.parseInt(movieId));
    }
    
    @DeleteMapping("/movies/{movieId}")
    public Movie deleteMovie(@PathVariable String movieId) {
    	return this.service.deleteMovie(Integer.parseInt(movieId));
    }
    
}
