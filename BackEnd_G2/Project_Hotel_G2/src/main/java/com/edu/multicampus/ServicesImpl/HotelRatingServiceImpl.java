package com.edu.multicampus.ServicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.multicampus.Model.HotelRating;
import com.edu.multicampus.Repository.HotelRatingRepository;
import com.edu.multicampus.Services.HotelRatingService;

@Service
public class HotelRatingServiceImpl implements HotelRatingService {
	
	@Autowired
	private HotelRatingRepository hotelratingRepository;
	
	@Override
	public List<HotelRating> getAllBills() {
		// TODO Auto-generated method stub
		return hotelratingRepository.findAll();
	}

	@Override
	public Optional<HotelRating> getHotelRatingById(long id) {
		// TODO Auto-generated method stub
		return hotelratingRepository.findById(id);
	}

	@Override
	public void addHotelRating(HotelRating hotelRating) {
		this.hotelratingRepository.save(hotelRating);
		
	}

	@Override
	public void updateHotelRating(HotelRating hotelRating, long id) {
		Optional<HotelRating> optional = hotelratingRepository.findById(id);
		HotelRating h = null;
		if(optional.isPresent()) {
			h = optional.get();
			h.setHotelratingId(hotelRating.getHotelratingId());
			h.setHotel(hotelRating.getHotel());
			h.setCustomer(hotelRating.getCustomer());
		
			hotelratingRepository.save(h);
		}else {
			throw new RuntimeException("HotelRating not found");
		}
	}

	@Override
	public void deleteHotelRating(long id) {
		Optional<HotelRating> optional = hotelratingRepository.findById(id);
		if(optional.isPresent()) {
			this.hotelratingRepository.deleteById(id);
		}else {
			throw new RuntimeException("HotelRating not found");
		}
	}
	
}
