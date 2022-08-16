package com.edu.multicampus.Services;

import com.edu.multicampus.Model.Service;
import java.util.List;

public interface ServiceService {
	List<Service> findAllService();
	
	Service getServiceById(long id);
	
	void addService(Service service, long id);
	
	void updateService(Service service, long id);
	
	void deleteService(long id);
	
}
