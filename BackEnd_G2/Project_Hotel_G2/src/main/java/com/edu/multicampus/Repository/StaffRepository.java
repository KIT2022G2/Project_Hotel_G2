package com.edu.multicampus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.multicampus.Model.Staff;

public interface StaffRepository extends JpaRepository<Staff, Long> {

}
