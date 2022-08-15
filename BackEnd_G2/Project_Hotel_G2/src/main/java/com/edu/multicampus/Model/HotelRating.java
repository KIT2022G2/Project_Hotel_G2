package com.edu.multicampus.Model;

import javax.persistence.*;
@Entity
@Table(name="hotelrating")
public class HotelRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotelratingId;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="codehotel",nullable=false,referencedColumnName="codehotel")
    private Hotel hotel;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="codecustomer",nullable=false,referencedColumnName="codecustomer")
    private Customer customer;
}
