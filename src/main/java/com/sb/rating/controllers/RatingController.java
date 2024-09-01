package com.sb.rating.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.rating.entities.Rating;
import com.sb.rating.services.RatingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService ratingService;
	
	@PostMapping 
	public ResponseEntity<Rating> create(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(this.ratingService.create(rating));
	}
	
	@GetMapping		
	public ResponseEntity<List<Rating>> getRatings() {
		return ResponseEntity.status(HttpStatus.OK).body(this.ratingService.getAllRatings());
	}

	@GetMapping("/users/{userId}")		
	public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userId) {
		return ResponseEntity.status(HttpStatus.OK).body(this.ratingService.getRatingByUserId(userId));
	}
	

	@GetMapping("/hotels/{hotelId}")	
	public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable String hotelId) {
		return ResponseEntity.status(HttpStatus.OK).body(this.ratingService.getRatingByHotelId(hotelId));
	}
	
}
