package com.sonata.Controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sonata.Model.CatalogItem;
import com.sonata.Model.Movie;
import com.sonata.Model.Rating;
import com.sonata.Model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId")String userId){
//List<Rating> ratings=Arrays.asList(new Rating("123",5),new Rating("346",1));
		
	UserRating ratings=restTemplate.getForObject("http://localhost:8089/ratingdata/users/"+userId,UserRating.class);	
	
 return ratings.getUserRating().stream().map(rating->{
	 Movie movie =restTemplate.getForObject("http://localhost:8088/movies/"+rating.getMovieId(),Movie.class);
	 return new CatalogItem(movie.getName(),"This is my movie",rating.getRating());
 }).collect(Collectors.toList());

		//		return Collections.singletonList(
		//		new CatalogItem("SpiderMan","This is a movie",4));
	}
	
	
}
