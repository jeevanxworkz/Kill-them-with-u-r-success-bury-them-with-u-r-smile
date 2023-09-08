package com.xworkz.dto.app.repositry;

import com.xworkz.dto.app.service.NewspaperService;

public interface NewspaperRepository {
	
	int TOTAL_ITEMS=5;
	void save(NewspaperService dto);
	void save(NewspaperRepository dto); 
	}

