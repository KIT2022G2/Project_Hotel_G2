package com.edu.multicampus.Model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billId;
    
    @Column(columnDefinition = "DATE DEFAULT (CURRENT_DATE)")
    private Date checkinDate;

    @Column(columnDefinition = "DATE")
    private Date datetime;

    @Column(columnDefinition = "DATE")
    private Date checkoutDate;
    
    @Column(columnDefinition = "boolean default false")
    private boolean status;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="codestaff",nullable=false,referencedColumnName="codestaff")
    private Room room;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="codecustomer",nullable=false,referencedColumnName="codecustomer")
    private Customer customer;
}
