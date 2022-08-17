package com.edu.multicampus.Services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.edu.multicampus.Model.RoomRating;

public interface RoomRatingService {
	List<RoomRating> getAllRoomRating();
	int addRoomRating(RoomRating roomRating);
	int deleteRoomRatingById (long id);
	RoomRating getRoomRatingById (long id);
	Page<RoomRating> findRoomRatingPaginated(int pageNo, int pageSize);
	int updateRoomRatingById (long id, RoomRating roomRating);
}

