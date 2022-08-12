package com.edu.multicampus.Model;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serviceId;
    
    private String serviceName;
    
    private int servicePrice;
    
    private int amount;
    
    private int total;
    
    @OneToMany(mappedBy="use")
    private List<Use> use;
}
