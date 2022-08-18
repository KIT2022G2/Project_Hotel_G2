package com.edu.multicampus.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.multicampus.Model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
	 Page<Room> findAll(Pageable pageable);
}
