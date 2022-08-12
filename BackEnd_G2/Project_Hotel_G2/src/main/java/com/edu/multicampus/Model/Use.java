package com.edu.multicampus.Model;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="use")
public class Use {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long useId;
    
    @Column(columnDefinition = "DATE DEFAULT (CURRENT_DATE)")
    private Date time;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="coderoom",nullable=false,referencedColumnName="coderoom")
    private Room room;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="codeservice",nullable=false,referencedColumnName="codeservice")
    private Service service;
}
