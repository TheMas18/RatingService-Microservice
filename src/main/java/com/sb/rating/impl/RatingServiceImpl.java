package com.sb.rating.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.rating.entities.Rating;
import com.sb.rating.repository.RatingRepository;
import com.sb.rating.services.RatingService;

@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public Rating create(Rating rating) {
		// TODO Auto-generated method stub
		return this.ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRatings() {
		// TODO Auto-generated method stub
		return this.ratingRepository.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		return this.ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return this.ratingRepository.findByHotelId(hotelId);
	
	}

}
