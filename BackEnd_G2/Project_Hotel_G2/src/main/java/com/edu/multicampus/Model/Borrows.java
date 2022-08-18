package com.edu.multicampus.Model;
import java.sql.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="borrow")
public class Borrows {
  
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long borrowId;
    
    @Column(columnDefinition = "DATE DEFAULT (CURRENT_DATE)")
    private Date checkinDate;

    @Column(columnDefinition = "DATE")
    private Date checkoutDate;

    @Column(columnDefinition = "boolean default false")
    private boolean status;
    
    @ManyToOne
    @JoinColumn(name="code_room_borrow",nullable=false)
    private Room room;
    
    @ManyToOne
    @JoinColumn(name="code_customer",nullable=false)
    private Customer customer;
   
}
