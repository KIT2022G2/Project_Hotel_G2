package com.edu.multicampus.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.edu.multicampus.Model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
	 Page<Room> findAll(Pageable pageable);
	 
	 @Query(value = "select * from room where room_name like %?1% ", nativeQuery = true)
	 List<Room> findAllRoomsByName(String nameRoom);
}
