package com.edu.multicampus.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.edu.multicampus.Model.Hotel;

public interface HotelService {
	List<Hotel> getAllHotels();
	List<Hotel> getAllHotelsByName(String hotelname);
	int addHotel(Hotel hotel);
	int deleteHotelById (long id);
	Optional<Hotel> getHotelById (long id);
	Page<Hotel> findHotelPaginated(int pageNo, int pageSize);
	int updateHotelById (long id, Hotel hotel);
}
