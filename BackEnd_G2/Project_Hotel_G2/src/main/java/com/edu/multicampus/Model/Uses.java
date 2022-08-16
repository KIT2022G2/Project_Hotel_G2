package com.edu.multicampus.Model;
import java.sql.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="uses")
public class Uses {
  
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long useId;
    
    @Column(columnDefinition = "DATE DEFAULT (CURRENT_DATE)")
    private Date time;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="code_room",nullable=false)
    private Room room;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="code_service",nullable=false)
    private Service service;
    
}
