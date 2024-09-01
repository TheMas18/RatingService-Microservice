package com.sb.rating.services;

import java.util.List;

import com.sb.rating.entities.Rating;

public interface RatingService {

	
	Rating create(Rating rating);
	
	List<Rating> getAllRatings();
	
	List<Rating> getRatingByUserId(String userId);
	
	List<Rating> getRatingByHotelId(String hotelId);
}
