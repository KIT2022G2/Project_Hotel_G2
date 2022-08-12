package com.edu.multicampus.Model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="roomrating")
public class RoomRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomratingId;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="coderoom",nullable=false,referencedColumnName="coderoom")
    private Room room;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="codecustomer",nullable=false,referencedColumnName="codecustomer")
    private Customer customer;
}
