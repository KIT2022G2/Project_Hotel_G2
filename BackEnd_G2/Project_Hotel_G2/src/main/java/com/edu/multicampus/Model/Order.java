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
@Table(name="order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    
    @Column(columnDefinition = "DATE DEFAULT (CURRENT_DATE)")
    private Date arriveDate;

    @Column(columnDefinition = "DATE")
    private Date datetime;

    @Column(columnDefinition = "DATE")
    private Date leaveDate;

    @Column(columnDefinition = "boolean default false")
    private boolean status;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="coderoom",nullable=false,referencedColumnName="coderoom")
    private Room room;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="codecustomer",nullable=false,referencedColumnName="codecustomer")
    private Customer customer;
}
