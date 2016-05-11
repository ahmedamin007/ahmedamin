package mum.edu.extracredit.dao;

import java.util.Collection;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import mum.edu.extracredit.domain.Movie;

@Transactional(propagation=Propagation.REQUIRED)
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
	@SuppressWarnings("unchecked")
	public Collection<Movie> getMovies() {
		return sf.getCurrentSession().createQuery("select distinct a from Movie a " +
				"join fetch a.artists " +
				"join fetch a.movieReviews").list();
	}


}
