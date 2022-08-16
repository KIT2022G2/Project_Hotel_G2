package com.edu.multicampus.Model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="staff")
public class Staff {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long staffId;
	
	@Column(name="staffname",nullable=false)
	private String staffName;
	
	@Column(name="staffusername",nullable=false)
	private String staffUserName;
	
	@Column(name="staffpassword",nullable=false)
	private String staffPassword;
	
	@OneToMany(mappedBy="staff", cascade = CascadeType.ALL)
	private List<Bill> bill;
	
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="code_staff",nullable=false)
    private Hotel hotel;
}
