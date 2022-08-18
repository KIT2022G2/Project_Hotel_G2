package com.edu.multicampus.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;



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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billId;
    
    @Column(columnDefinition = "DATE DEFAULT (CURRENT_DATE)")
    private Date checkinDate;

    @Column(columnDefinition = "DATE")
    private Date checkoutDate;
    
    @Column(columnDefinition = "boolean default false")
    private boolean status;
    
    @ManyToOne
    @JoinColumn(name="code_staff",nullable=false)
    private Staff staff;
    
    @ManyToOne
    @JoinColumn(name="code_customer",nullable=false)
    private Customer customer;
}
