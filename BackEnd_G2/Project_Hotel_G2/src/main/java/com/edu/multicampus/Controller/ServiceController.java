package com.edu.multicampus.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.multicampus.Model.Services;
import com.edu.multicampus.Services.ServiceService;

@RestController
@RequestMapping("/api")
public class ServiceController {
	@Autowired
	ServiceService serviceService;
	
	@GetMapping("/service")
	public List<Services> getAllServicesById(){
		return serviceService.findAllService();
	}
	
	@GetMapping("/service/{id}")
	public Optional<Services> getServiceById(@PathVariable long id){
		return serviceService.getServiceById(id);
	}
	
	@PostMapping("/service")
	public void addService(@RequestBody Services service) {
		serviceService.addService(service);
	}
	
	@PutMapping("/service/{id}")
	public void updateService(@PathVariable long id, @RequestBody Services service) {
		serviceService.updateService(id, service);
	}
	
	@DeleteMapping("/service/{id}")
	public void deleteService(@PathVariable long id) {
		serviceService.deleteService(id);
	}
}
