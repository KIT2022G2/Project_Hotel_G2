package com.edu.multicampus.Services;

import java.util.List;
import java.util.Optional;


import com.edu.multicampus.Model.HotelRating;

public interface HotelRatingService {
	List<HotelRating> getAllHotelRatings();
	
	Optional<HotelRating> getHotelRatingById(long id);
	
	void addHotelRating(HotelRating hotelRating);
	
	void updateHotelRating(long id, HotelRating hotelRating) ;
	
	void deleteHotelRating(long id);
}
