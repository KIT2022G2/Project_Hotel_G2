package com.edu.multicampus.Model;
import lombok.Data;
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

@Data
@Entity
@Table(name="bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billId;
    
    @Column(columnDefinition = "DATE DEFAULT (CURRENT_DATE)")
    private Date checkinDate;

    @Column(columnDefinition = "DATE")
    private Date dateTime;

    @Column(columnDefinition = "DATE")
    private Date checkoutDate;
    
    @Column(columnDefinition = "boolean default false")
    private boolean status;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="code_staff",nullable=false)
    private Staff staff;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="code_customer",nullable=false)
    private Customer customer;
}
