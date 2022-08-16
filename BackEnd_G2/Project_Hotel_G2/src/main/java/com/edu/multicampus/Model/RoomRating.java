package com.edu.multicampus.Model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="roomrating")
public class RoomRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomratingId;
    
    private String rating;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="code_room",nullable=false)
    private Room room;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="code_customer",nullable=false)
    private Customer customer;
}
