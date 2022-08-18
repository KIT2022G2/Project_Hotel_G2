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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name="staff")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long staffId;
	
	@Column(name="staffName",nullable=false)
	private String staffName;
	
	@Column(name="staffUserName",nullable=false)
	private String staffUserName;
	
	@Column(name="staffPassword",nullable=false)
	private String staffPassword;
	
	@OneToMany(mappedBy="staff", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Bill> bill;
	
    @ManyToOne
    @JoinColumn(name="code_hotel",nullable=false)
    private Hotel hotel;
}
