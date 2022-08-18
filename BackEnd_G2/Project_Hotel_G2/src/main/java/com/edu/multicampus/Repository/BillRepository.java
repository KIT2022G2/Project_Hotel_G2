package com.edu.multicampus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.multicampus.Model.Bill;

@Repository
public interface BillRepository  extends JpaRepository<Bill, Long> {

}
