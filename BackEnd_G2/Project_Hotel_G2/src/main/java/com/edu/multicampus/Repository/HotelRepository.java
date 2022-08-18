package com.edu.multicampus.Repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.edu.multicampus.Model.Hotel;



@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
	 Page<Hotel> findAll(Pageable pageable);
	 
		@Query(value = "select * from hotel where hotel_name like %?1%  ", nativeQuery = true)
		List<Hotel> findAllHotelsByName(String nameHotel);
}
