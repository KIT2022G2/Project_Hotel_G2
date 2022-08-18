package com.edu.multicampus.ServicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.multicampus.Model.Uses;
import com.edu.multicampus.Repository.UsesRepository;
import com.edu.multicampus.Services.UsesService;

@Service
public class UsesServicesImpl implements UsesService{
	
	@Autowired
	UsesRepository usesRepository;

	@Override
	public List<Uses> findAllUses() {
		// TODO Auto-generated method stub
		return usesRepository.findAll();
	}

	@Override
	public Optional<Uses> getUsesById(long id) {
		// TODO Auto-generated method stub
		return usesRepository.findById(id);
	}

	@Override
	public void addUses(Uses uses) {
		this.usesRepository.save(uses);
		
	}

	@Override
	public void updateUses( long id, Uses uses) {
		Optional<Uses> optional = usesRepository.findById(id);
		Uses u = null;
		if(optional.isPresent()) {
			u = optional.get();
			u.setService(uses.getService());
			u.setTime(uses.getTime());
			u.setRoom(uses.getRoom());
			usesRepository.save(u);
		}else {
			throw new RuntimeException("Uses not found");
		}
		
	}

	@Override
	public void deleteUses(long id) {
		// TODO Auto-generated method stub
		Optional<Uses> optional = usesRepository.findById(id);
		if(optional.isPresent()) {
			usesRepository.deleteById(id);
		}else {
			throw new RuntimeException("Uses not found");
		}
	}
}
