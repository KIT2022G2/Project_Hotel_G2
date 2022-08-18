package com.edu.multicampus.Model;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name="service")
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serviceId;
    
    private String serviceName;
    
    private int servicePrice;
    
    private int amount;
    
    private int total;
    
    @OneToMany(mappedBy="service")
    @JsonIgnore
    private List<Uses> use;
    
}
