package com.xworkz.Crud.repository;

import com.xworkz.Crud.dto.RailwayStationDto;
import com.xworkz.Crud.exception.StorageFullException;

public class RailwayStationRepositoryImpl implements RailwayStationRepository {
	
	private RailwayStationDto[] dtos=new RailwayStationDto[5];
	private int index=0;
	
	@Override
	public boolean save(RailwayStationDto dto) throws StorageFullException {
		if(this.index>=this.dtos.length) {
			System.err.println("Railway size is exceeded...");
			throw new StorageFullException("Railway size is exceeded");
		}
		this.dtos[this.index]=dto;
		this.index++;
		return true;
		
		
	}

}
