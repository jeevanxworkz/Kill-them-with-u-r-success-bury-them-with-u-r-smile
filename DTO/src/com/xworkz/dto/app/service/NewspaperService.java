package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.NewspaperDTO;

public interface NewspaperService {

	default boolean ValidateAndsave(NewspaperDTO dto) {
		return false;
	}

}
