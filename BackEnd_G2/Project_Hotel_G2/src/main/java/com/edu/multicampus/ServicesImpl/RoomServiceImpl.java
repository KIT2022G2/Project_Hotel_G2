package com.edu.multicampus.ServicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.edu.multicampus.Model.Room;
import com.edu.multicampus.Model.Room;
import com.edu.multicampus.Repository.roomRepository;
import com.edu.multicampus.Repository.RoomRepository;
import com.edu.multicampus.Services.RoomService;

@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
    private RoomRepository roomRepository;
	
	@Override
	public List<Room> getAllRooms() {
		// TODO Auto-generated method stub
		return roomRepository.findAll();
	}

	@Override
	public int addRoom(Room room) {
		// TODO Auto-generated method stub
		 List<Room> all = roomRepository.findAll();
		 if(!all.contains(room)){
			 roomRepository.save(room);
	            return 1;
	        }
		return 0;
	}

	@Override
	public int deleteRoomById(long id) {
		// TODO Auto-generated method stub
		 Optional<Room> found = roomRepository.findById(id);
	        if(found.isPresent()){
	        	roomRepository.delete(found.get());
	            return 1;
	        }
		return 0;
	}

	@Override
	public Room getRoomById(long id) {
		// TODO Auto-generated method stub
		 Optional<Room> found = roomRepository.findById(id);
			return found.get();

	}

	@Override
	public Page<Room> findRoomPaginated(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		 Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
	     return roomRepository.findAll(pageable);	
	}

	@Override
	public int updateRoomById(long id, Room room) {
		// TODO Auto-generated method stub
		Optional<Room> found = roomRepository.findById(id);
		 if(found.isPresent()){
	            found.get().setRoomImageURl(room.getRoomImageURl());
	            found.get().setRoomName(room.getRoomName());
	            found.get().setRoomPrice(room.getRoomPrice());
	            found.get().setRoomSize(room);
	            found.get().setRoomState(null);
	            roomRepository.save(found.get());
	            return 1;
	        }
		return 0;
	}

}
