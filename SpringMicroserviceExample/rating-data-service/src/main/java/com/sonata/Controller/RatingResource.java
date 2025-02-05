package com.sonata.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.Model.Rating;
import com.sonata.Model.UserRating;

@RestController
@RequestMapping("/ratingdata")
public class RatingResource {
	@RequestMapping("/{movieId}")
	public Rating getRatingData(@PathVariable("movieId")String movieId) {
		return new Rating(movieId,4);
	}
	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId")String userId) {
		List<Rating> ratings=Arrays.asList(
				new Rating("123",5),
				new Rating("456",2));
		UserRating userRating =new UserRating();
		userRating.setUserRating(ratings);
		return userRating;
	}
}
