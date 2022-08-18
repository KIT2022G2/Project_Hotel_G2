package com.edu.multicampus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.multicampus.Model.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

}
