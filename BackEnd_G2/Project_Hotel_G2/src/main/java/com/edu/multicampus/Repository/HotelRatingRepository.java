package com.edu.multicampus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.multicampus.Model.HotelRating;

@Repository
public interface  HotelRatingRepository extends JpaRepository<HotelRating, Long> {

}
