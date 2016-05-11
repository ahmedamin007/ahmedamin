package mum.edu.extracredit.dao;

import java.util.ArrayList;
import java.util.Collection;
import mum.edu.extracredit.domain.Movie;

public class MovieDAO implements IMovies {
	protected Collection<Movie> moviesList=new ArrayList<Movie>();
	
	public MovieDAO() {
		
	}

	@Override
	public void saveMovie(Movie movie) {
		moviesList.add(movie);
		
	}

	@Override
	public Collection<Movie> getMovies() {
		return moviesList;
	}

}
