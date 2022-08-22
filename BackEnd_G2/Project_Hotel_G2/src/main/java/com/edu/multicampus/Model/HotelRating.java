package com.edu.multicampus.Model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="hotelrating")
public class HotelRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotelratingId;
    
    private String image;
    
    private String comment;
    
    @ManyToOne
    @JoinColumn(name="code_hotel",nullable=false)
    private Hotel hotel;
    
    @ManyToOne
    @JoinColumn(name="code_customer",nullable=false)
    private Customer customer;
}
