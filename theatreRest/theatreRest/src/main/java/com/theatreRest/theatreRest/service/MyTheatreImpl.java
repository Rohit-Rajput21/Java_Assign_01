package com.theatreRest.theatreRest.service;

import org.springframework.stereotype.Service;

import com.theatreRest.theatreRest.entities.Movie;

import java.util.ArrayList;
import java.util.List;
@Service
public class MyTheatreImpl implements MyTheatreService {
	
	List<Movie> list;
	public MyTheatreImpl() {
		list=new ArrayList<>();
		list.add(new Movie(101,"RRR","Junior NTR","Alia Bhatt"));
		list.add(new Movie(102,"URI","Vicky Kaushal","Yami Gautam"));
	}
	@Override
	public List<Movie> moviesShow() {
		
		return list;
	}
	@Override
	public Movie getMovie(int movieId) {
		Movie movie=null;
		for(Movie m:list) {
			if(m.getId()==movieId) {
				movie=m;
				break;
			}
		}
		return movie;
	}
	@Override
	public Movie addMovie(Movie movie) {
		list.add(movie);
		return movie;
	}
	@Override
	public Movie updateMovieDetails(Movie movie,int movieId) {
		for(Movie m:list) {
			if(m.getId()==movieId) {
				m.setName(movie.getName());
				m.setActorName(movie.getActorName());
				m.setActressName(movie.getActressName());
				break;
			}
		}
		return movie;
	}
	@Override
	public Movie deleteMovie(int movieId) {
		Movie movie=null;
		for(Movie m:list) {
			if(m.getId()==movieId) {
				movie=m;
				list.remove(m);
				break;
			}
		}
		return movie;
	}
	
	

}
