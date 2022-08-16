package com.edu.multicampus.Repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.multicampus.Model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
	 Page<Hotel> findAll(Pageable pageable);
}
