package mum.edu.extracredit.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity

public class Movie implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int year;
	@ElementCollection
	@Enumerated(EnumType.STRING)
	private Genere generes ;
	private String director;
	private String characterName;
	@OneToMany
	private List<Artist> artistList;
	@Enumerated(EnumType.STRING)
	private MovieRating ratingList;
	@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
	private List<Review> movieReviews = new ArrayList<Review>();
	

	public Movie(int id, String name, int year,  Genere  generes, String director, String characterName,
			List<Artist> artistList, MovieRating ratingList, List<Review> movieReviews) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.generes = generes;
		this.director = director;
		this.characterName = characterName;
		this.artistList = artistList;
		this.ratingList = ratingList;
		this.movieReviews = movieReviews;
	}

	public void setGeneres( Genere  generes) {
		this.generes = generes;
	}

	public void setRatingList(MovieRating ratingList) {
		this.ratingList = ratingList;
	}

	public void setMovieReviews(List<Review> movieReviews) {
		this.movieReviews = movieReviews;
	}
	
	public Movie() {
		
	}

	public  Genere  getGeneres() {
		return generes;
	}

	public MovieRating getRatingList() {
		return ratingList;
	}

	public List<Review> getMovieReviews() {
		return movieReviews;
	}
	
	public void addMovieReviews(Review review){
		movieReviews.add(review);
	}
	
	public void addArtist(Artist artist){
		artistList.add(artist);
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




}
