package com.edu.multicampus.Repository;

import com.edu.multicampus.Model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerRepository, Long> {
    Page<CustomerRepository> findAll(Pageable pageable);
}