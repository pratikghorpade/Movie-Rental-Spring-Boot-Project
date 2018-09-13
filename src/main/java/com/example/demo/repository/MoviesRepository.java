package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Movie;

public interface MoviesRepository extends JpaRepository<Movie, Integer> {

}
