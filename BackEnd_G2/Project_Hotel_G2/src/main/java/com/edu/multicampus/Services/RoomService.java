package com.edu.multicampus.Services;

import java.util.List;

import org.springframework.data.domain.Page;


import com.edu.multicampus.Model.Room;

public interface RoomService {
	List<Room> getAllRooms();
	int addRoom(Room room);
	int deleteRoomById (long id);
	Room getRoomById (long id);
	Page<Room> findRoomPaginated(int pageNo, int pageSize);
	int updateRoomById (long id, Room room);
}
