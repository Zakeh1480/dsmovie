package com.devsuperior.dsmovie.config.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {

	@EmbeddedId
	private ScorePk id = new ScorePk();
	private Double value;
	
	public Score() {
		
	}
	
	public void SetMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	public void SetUser(User user) {
		id.setUser(user);
	}

	public ScorePk getId() {
		return id;
	}

	public void setId(ScorePk id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
}
