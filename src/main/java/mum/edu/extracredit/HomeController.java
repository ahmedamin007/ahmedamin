package mum.edu.extracredit;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.jsp.jstl.core.Config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import mum.edu.extracredit.domain.Artist;
import mum.edu.extracredit.domain.Genere;
import mum.edu.extracredit.domain.Movie;
import mum.edu.extracredit.domain.Review;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController extends HttpServlet {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	// second commit
	//
	//

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		ServletContext srvletContext=getServletContext();
		WebApplicationContext context =  WebApplicationContextUtils.getWebApplicationContext(srvletContext);
			
		//create Artist 
		
		Artist artist1 =context.getBean("artist",Artist.class);
		Artist artist2 =context.getBean("artist",Artist.class);
		
		
		artist1.setArtId(1);
		artist1.setArtName("artist1");
		
		artist2.setArtId(2);
		artist2.setArtName("artist2");
		
		//create movie
		
		Genere generes = context.getBean("Genere",Genere.class);
		Movie movie1 =context.getBean("movie1",Movie.class);
		
		movie1.setId(1);
		movie1.setName("mov1");
		movie1.setCharacterName("mov carchater");
		movie1.setYear(2016);
		movie1.setGeneres(generes.Action);
		movie1.addArtist(artist1);
		movie1.addArtist(artist2);
		
		
		////add review 
		Review rev1=context.getBean("Review",Review.class);
		rev1.setId(1);
		rev1.setMovie(movie1);
		rev1.setRating(3);
		rev1.setUser("user 1 ");
		
		movie1.addMovieReviews(rev1);
		
		///add data in view 
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("movieName",movie1.getName()  );
		model.addAttribute("movieYear",movie1.getYear() );
		model.addAttribute("movieComment",movie1.getMovieReviews() );
		
		return "home";
	}
	
}
