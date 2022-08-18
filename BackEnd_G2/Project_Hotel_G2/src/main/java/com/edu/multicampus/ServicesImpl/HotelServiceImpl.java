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
	public Optional<Hotel> getHotelById(long id) {
		// TODO Auto-generated method stub
			return hotelRepository.findById(id);
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
	            hotelRepository.save(found.get());
	            return 1;
	        }
		return 0;
	}

	@Override
	public List<Hotel> getAllHotelsByName(String hotelname) {
		// TODO Auto-generated method stub
		return hotelRepository.findAllHotelsByName(hotelname);
	}


}
