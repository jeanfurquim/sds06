package com.dev.jpisistemas.dsmovie.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_score")
public class Score implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ScorePK id = new ScorePK();
	private Double value;

	public Score() {

	}

	public void SetMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	public void SetUser(User user) {
		id.setUser(user);
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}
