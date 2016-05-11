package mum.edu.extracredit.dao;

import java.util.Collection;
import mum.edu.extracredit.domain.Movie;

public interface IMovies {
	
	public void saveMovie(Movie movie);
	public Collection<Movie> getMovies();

}
