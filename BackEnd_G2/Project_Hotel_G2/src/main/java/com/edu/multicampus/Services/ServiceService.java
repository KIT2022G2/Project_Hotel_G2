package com.edu.multicampus.Services;

import com.edu.multicampus.Model.Services;
import java.util.List;
import java.util.Optional;

public interface ServiceService {
	List<Services> findAllService();
	
	Optional<Services> getServiceById(long id);
	
	void addService(Services service);
	
	void updateService( long id, Services service);
	
	void deleteService(long id);
	
}
