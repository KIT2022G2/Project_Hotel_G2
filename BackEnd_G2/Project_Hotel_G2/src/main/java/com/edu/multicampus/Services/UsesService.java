package com.edu.multicampus.Services;

import com.edu.multicampus.Model.Uses;
import java.util.List;

public interface UsesService {
	List<Uses> findAllUses();
	
	Uses getUsesById(long id);
	
	void addUses(Uses uses, long id);
	
	void updateUses(Uses uses, long id);
	
	void deleteUses(long id);
}
