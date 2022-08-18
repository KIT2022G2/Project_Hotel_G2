package com.edu.multicampus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.multicampus.Model.Borrows;

@Repository
public interface BorrowRepository extends JpaRepository<Borrows, Long> {

}
