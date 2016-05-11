package mum.edu.extracredit.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Movie {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int year;
	private String genre;
	private String director;
	private String characterName;
	@OneToMany
	private List<Artist> artistList;
	@OneToMany
	private List<Rating> ratingList;
	
	public Movie() {
		
	}
	public Movie(int id, String name, int year, String genre, String director, String characterName,
			List<Artist> artistList, List<Rating> ratingList) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.genre = genre;
		this.director = director;
		this.characterName = characterName;
		this.artistList = artistList;
		this.ratingList = ratingList;
	}
	
	public void addArtist(Artist artist){
		artistList.add(artist);
	}

	public void addRating(Rating rating){
		ratingList.add(rating);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public List<Artist> getArtistList() {
		return artistList;
	}

	public void setArtistList(List<Artist> artistList) {
		this.artistList = artistList;
	}

	public List<Rating> getRatingList() {
		return ratingList;
	}

	public void setRatingList(List<Rating> ratingList) {
		this.ratingList = ratingList;
	}



}
