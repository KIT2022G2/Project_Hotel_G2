package com.edu.multicampus.Services;

import java.util.List;
import java.util.Optional;


import com.edu.multicampus.Model.HotelRating;

public interface HotelRatingService {
	List<HotelRating> getAllBills();
	
	Optional<HotelRating> getHotelRatingById(long id);
	
	void addHotelRating(HotelRating hotelRating);
	
	void updateHotelRating(HotelRating hotelRating, long id);
	
	void deleteHotelRating(long id);
}
