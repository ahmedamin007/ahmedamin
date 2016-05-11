package mum.edu.extracredit.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Artist {
	@Id
	@GeneratedValue
	private int artId;
	private String artName;
	@OneToMany
	private List<Movie> artistMoviesList;
	

	public Artist(int artId, String artName) {
		this.artId = artId;
		this.artName = artName;
	}

	public int getArtId() {
		return artId;
	}

	public void setArtId(int artId) {
		this.artId = artId;
	}

	public String getArtName() {
		return artName;
	}

	public void setArtName(String artName) {
		this.artName = artName;
	}

}
