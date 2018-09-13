package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Movie;

import com.example.demo.repository.MoviesRepository;

@RestController
public class MovieController {

	@Autowired
	MoviesRepository moviesrepository ;
	
	//Retrieve List Of All Movies
	@GetMapping("/findallmovies")
     public List<Movie> getMovies() {
		System.out.println("String passed id : " );
		return moviesrepository.findAll();
	}
	
	//Insert A movie
	@PostMapping("/insertmovie")
    public void addMovies(@RequestBody Movie movie) {
		moviesrepository.save(movie);
	}
	
	
	//Delete a all movies
	@DeleteMapping("/deleteallmovies")
    public void deleteMovies() {
		moviesrepository.deleteAll();
	}
	
	//Delete a specific movie
	@GetMapping("/deletemovie/{sub}")
    public void DeleteMovies(@PathVariable String sub) {
		
		List <Movie> movies = new ArrayList<>();
	
		moviesrepository.findAll().forEach(movies :: add);
		
		for (Movie movie : movies) {
		
			if(movie.getName().equalsIgnoreCase(sub)) {
				int id = movie.getId();
				moviesrepository.deleteById(id);
			}	
		}	
	}
	
	
}
