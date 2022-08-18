package com.edu.multicampus.ServicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edu.multicampus.Model.Services;
import com.edu.multicampus.Repository.ServiceRepository;
import com.edu.multicampus.Services.ServiceService;

@Service
public class ServiceServiceImpl implements ServiceService {
	ServiceRepository serviceRepository;
	
	@Override
	public List<Services> findAllService() {
		// TODO Auto-generated method stub
		return serviceRepository.findAll();
	}

	@Override
	public Optional<Services> getServiceById(long id) {
		// TODO Auto-generated method stub
		return serviceRepository.findById(id);
	}

	@Override
	public void addService(Services service) {
		this.serviceRepository.save(service);
		
	}

	@Override
	public void updateService( long id, Services service) {
		// TODO Auto-generated method stub
		Optional<Services> optional = serviceRepository.findById(id);
		Services s = null;
		if(optional.isPresent()) {
			s = optional.get();
			s.setServiceName(service.getServiceName());
			s.setServicePrice(service.getServicePrice());
			s.setAmount(service.getAmount());
			s.setTotal(service.getTotal());
			s.setUse(service.getUse());
			serviceRepository.save(s);
		}else {
			throw new RuntimeException("Service not found");
		}
	}

	@Override
	public void deleteService(long id) {
		// TODO Auto-generated method stub
		Optional<Services> optional = serviceRepository.findById(id);
		if(optional.isPresent()) {
			this.serviceRepository.deleteById(id);
		}else {
			throw new RuntimeException("Service not found");
		}
	}

}
