package com.edu.multicampus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.multicampus.Model.RoomRating;
@Repository
public interface RoomRatingRepository  extends JpaRepository<RoomRating, Long> {

}