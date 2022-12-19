package com.xworkz.Crud.service;

import com.xworkz.Crud.dto.RailwayStationDto;
import com.xworkz.Crud.exception.InvalidNameDataException;
import com.xworkz.Crud.exception.StorageFullException;

public interface RailwayStaionService  {
	boolean validateAndSave(RailwayStationDto dto) throws StorageFullException,InvalidNameDataException;
}
