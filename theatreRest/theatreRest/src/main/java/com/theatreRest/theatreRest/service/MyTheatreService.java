package com.theatreRest.theatreRest.service;

import java.util.List;

import com.theatreRest.theatreRest.entities.Movie;

public interface MyTheatreService {
    public List<Movie> moviesShow();
    public Movie getMovie(int movieId);
    public Movie addMovie(Movie movie);
    public Movie updateMovieDetails(Movie movie,int movieId);
    public Movie deleteMovie(int movieId);
}
