package com.edu.multicampus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.multicampus.Model.RoomRating;

public interface RoomRatingRepository  extends JpaRepository<RoomRating, Long> {

}