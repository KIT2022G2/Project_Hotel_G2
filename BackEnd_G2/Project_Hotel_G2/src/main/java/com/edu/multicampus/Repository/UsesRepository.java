package com.edu.multicampus.Repository;

import com.edu.multicampus.Model.Uses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsesRepository extends JpaRepository<Uses,Long> {
}