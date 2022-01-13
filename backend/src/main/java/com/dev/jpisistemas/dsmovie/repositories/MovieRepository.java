package com.dev.jpisistemas.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.jpisistemas.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
