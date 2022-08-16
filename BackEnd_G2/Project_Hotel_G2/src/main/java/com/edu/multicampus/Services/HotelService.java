package com.edu.multicampus.Services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.edu.multicampus.Model.Hotel;

public interface HotelService {
	List<Hotel> getAllHotels();
	int addHotel(Hotel hotel);
	int deleteHotelById (long id);
	Hotel getHotelById (long id);
	Page<Hotel> getAllCard(int pageNo, int pageSize);
	int updateHotelById (long id, Hotel hotel);
}
