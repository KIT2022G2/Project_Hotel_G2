package com.edu.multicampus.ServicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.edu.multicampus.Model.Hotel;
import com.edu.multicampus.Repository.HotelRepository;
import com.edu.multicampus.Services.HotelService;
@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
    private HotelRepository hotelRepository;
	
	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	@Override
	public int addHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		 List<Hotel> all = hotelRepository.findAll();
		 if(!all.contains(hotel)){
			 hotelRepository.save(hotel);
	            return 1;
	        }
		return 0;
	}

	@Override
	public int deleteHotelById(long id) {
		// TODO Auto-generated method stub
		 Optional<Hotel> found = hotelRepository.findById(id);
	        if(found.isPresent()){
	        	hotelRepository.delete(found.get());
	            return 1;
	        }
		return 0;
	}

	@Override
	public Hotel getHotelById(long id) {
		// TODO Auto-generated method stub
		 Optional<Hotel> found = hotelRepository.findById(id);
		return found.get();
	}

	@Override
	public Page<Hotel> findHotelPaginated(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		 Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
	     return hotelRepository.findAll(pageable);	
	}

	@Override
	public int updateHotelById(long id, Hotel hotel) {
		// TODO Auto-generated method stub
		Optional<Hotel> found = hotelRepository.findById(id);
		 if(found.isPresent()){
	            found.get().setHotelLocation(hotel.getHotelLocation());
	            found.get().setHotelName(hotel.getHotelName());
	            found.get().setRoom(hotel.getRoom());
	            found.get().setStaff(hotel.getStaff());
	            found.get().setHotelrating(hotel.getHotelrating());
	            hotelRepository.save(hotel);
	            return 1;
	        }
		return 0;
	}

}
