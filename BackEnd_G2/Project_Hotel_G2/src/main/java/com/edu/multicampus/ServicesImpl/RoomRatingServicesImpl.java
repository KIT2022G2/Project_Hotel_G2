package com.edu.multicampus.ServicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.edu.multicampus.Model.RoomRating;
import com.edu.multicampus.Repository.RoomRatingRepository;
import com.edu.multicampus.Services.RoomRatingService;

@Service
public class RoomRatingServicesImpl implements RoomRatingService{
	@Autowired
	private RoomRatingRepository roomRatingRepository;
	
	@Override
	public List<RoomRating> getAllRoomRating() {
		// TODO Auto-generated method stub
		return roomRatingRepository.findAll();
	}

	@Override
	public void addRoomRating(RoomRating roomRating) {
		// TODO Auto-generated method stub
		 roomRatingRepository.save(roomRating);
	}

	@Override
	public void deleteRoomRatingById(long id) {
		Optional<RoomRating> optional = roomRatingRepository.findById(id);
		if(optional.isPresent()) {
			this.roomRatingRepository.deleteById(id);
		}else {
			throw new RuntimeException("RoomRating not found");
		}

	}

	@Override
	public Optional<RoomRating> getRoomRatingById(long id) {
		// TODO Auto-generated method stub
		return roomRatingRepository.findById(id);
	}


	@Override
	public void updateRoomRatingById(long id, RoomRating roomRating) {
		Optional<RoomRating> optional = roomRatingRepository.findById(id);
		RoomRating r = null;
		if(optional.isPresent()) {
			r = optional.get();
			r.setRating(roomRating.getRating());
			r.setRoom(roomRating.getRoom());
			r.setCustomer(roomRating.getCustomer());
			roomRatingRepository.save(r);
		}else {
			throw new RuntimeException("RoomRating not found");
		}
	}

}
