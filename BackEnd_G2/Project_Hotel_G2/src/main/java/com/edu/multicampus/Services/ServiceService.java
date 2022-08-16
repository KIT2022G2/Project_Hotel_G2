package com.edu.multicampus.Services;

import com.edu.multicampus.Model.Service;


public interface ServiceService {
	
	Service getServiceById(long id);
	
	void saveService(Service service);
	
	void addService(Service service, long id);
	
	void updateService(Service service, long id);
	
	void deleteService(long id);
	
}
