package com.edu.multicampus.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.multicampus.Model.HotelRating;
import com.edu.multicampus.Services.HotelRatingService;


@RestController
@RequestMapping("/api")
public class HotelRatingController {
	
	@Autowired
	HotelRatingService hotelRatingService;
	
	@GetMapping("/hotelrating")
	public List<HotelRating> getAllHotelRatings(){
		return hotelRatingService.getAllHotelRatings();
	}
	
	@PostMapping("/hotelrating")
	void addHotelRating(@RequestBody HotelRating hotelRating) {
		hotelRatingService.addHotelRating(hotelRating);
	}
}
