package com.sb.rating.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sb.rating.entities.Rating;

public interface RatingRepository  extends MongoRepository<Rating, String>{
	//custom methods
	
	List<Rating> findByUserId(String userId);
	
	List<Rating> findByHotelId(String hotelId);

}
