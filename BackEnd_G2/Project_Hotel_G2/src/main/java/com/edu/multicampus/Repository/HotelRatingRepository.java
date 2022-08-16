package com.edu.multicampus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.multicampus.Model.HotelRating;



public interface  HotelRatingRepository extends JpaRepository<HotelRating, Long> {

}
