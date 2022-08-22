package com.edu.multicampus.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.edu.multicampus.Model.RoomRating;

public interface RoomRatingService {
	List<RoomRating> getAllRoomRating();
	void addRoomRating(RoomRating roomRating);
	void deleteRoomRatingById (long id);
	Optional<RoomRating> getRoomRatingById (long id);
	void updateRoomRatingById (long id, RoomRating roomRating);
}

