package com.edu.multicampus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.multicampus.Model.Bill;



public interface BillRepository  extends JpaRepository<Bill, Long> {

}
