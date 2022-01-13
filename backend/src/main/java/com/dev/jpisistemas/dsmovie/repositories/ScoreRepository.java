package com.dev.jpisistemas.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.jpisistemas.dsmovie.entities.Score;
import com.dev.jpisistemas.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
