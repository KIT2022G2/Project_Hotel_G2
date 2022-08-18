package com.edu.multicampus.Services;

import com.edu.multicampus.Model.Uses;
import java.util.List;
import java.util.Optional;

public interface UsesService {
	List<Uses> findAllUses();
	
	Optional<Uses> getUsesById(long id);
	
	void addUses(Uses uses);
	
	void updateUses( long id, Uses uses);
	
	void deleteUses(long id);
}
