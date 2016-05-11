package mum.edu.extracredit.dao;

import java.util.Collection;
import org.hibernate.SessionFactory;
import mum.edu.extracredit.domain.Movie;

public class MovieDAOHibernate implements IMovies {
	private SessionFactory sf ;
	
	public MovieDAOHibernate(SessionFactory sf) {
		this.sf=sf;
	}

	@Override
	public void saveMovie(Movie movie) {
		sf.getCurrentSession().persist(movie);
	}

	@Override
	public Collection<Movie> getMovies() {
		
		return null;
	}


}
