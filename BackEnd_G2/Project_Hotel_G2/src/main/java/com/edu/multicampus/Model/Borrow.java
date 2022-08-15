package com.edu.multicampus.Model;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="borrow")
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long borrowId;
    
    @Column(columnDefinition = "DATE DEFAULT (CURRENT_DATE)")
    private Date checkinDate;

    @Column(columnDefinition = "DATE")
    private Date datetime;

    @Column(columnDefinition = "DATE")
    private Date checkoutDate;

    @Column(columnDefinition = "boolean default false")
    private boolean status;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="coderoom",nullable=false,referencedColumnName="coderoom")
    private Room room;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="codecustomer",nullable=false,referencedColumnName="codecustomer")
    private Customer customer;
}
