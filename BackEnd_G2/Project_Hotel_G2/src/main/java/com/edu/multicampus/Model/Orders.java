package com.edu.multicampus.Model;

import java.sql.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    
    @Column(columnDefinition = "DATE DEFAULT (CURRENT_DATE)")
    private Date arriveDate;

    @Column(columnDefinition = "DATE")
    private Date leaveDate;

    @Column(columnDefinition = "boolean default false")
    private boolean status;
    
    @ManyToOne
    @JoinColumn(name="code_room_order",nullable=false)
    private Room room;
    
    @ManyToOne
    @JoinColumn(name="code_customer",nullable=false)
    private Customer customer;
}
