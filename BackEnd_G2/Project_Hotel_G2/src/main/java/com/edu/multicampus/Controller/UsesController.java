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

import com.edu.multicampus.Model.Uses;
import com.edu.multicampus.Services.UsesService;

@RestController
@RequestMapping("/api")
public class UsesController {
	
	@Autowired
	UsesService usesService;
	
	@GetMapping("/uses")
	public List<Uses> getAllUsesById(){
		return usesService.findAllUses();
	}
	
	@GetMapping("/uses/{id}")
	public Optional<Uses> getUsesById(@PathVariable long id){
		return usesService.getUsesById(id);
	}
	
	@PostMapping("/uses")
	public void addUses(@RequestBody Uses uses ) {
		usesService.addUses(uses);
	}
	
	@PutMapping("/uses/{id}")
	public void updateUses(@PathVariable long id,@RequestBody Uses uses ) {
		usesService.updateUses(id, uses);
	}
	
	@DeleteMapping("/uses/{id}")
	public void deleteUses(@PathVariable long id) {
		usesService.deleteUses(id);
	}
}
