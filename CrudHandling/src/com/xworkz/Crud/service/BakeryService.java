package com.xworkz.Crud.service;

import com.xworkz.Crud.dto.BakeryDTO;
import com.xworkz.Crud.dto.RailwayStationDto;
import com.xworkz.Crud.exception.InvalidNameDataException;
import com.xworkz.Crud.exception.StorageFullException;
import com.xworkz.Crud.repository.BakeryRepository;

public interface BakeryService {

	boolean validateAndSave(BakeryDTO dto) throws StorageFullException, InvalidNameDataException;
	
	
}
