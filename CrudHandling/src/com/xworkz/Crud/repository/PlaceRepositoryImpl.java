package com.xworkz.Crud.repository;

import com.xworkz.Crud.dto.PlaceDTO;
import com.xworkz.Crud.exception.StorageFullException;

public class PlaceRepositoryImpl implements PlaceRepository {
	private PlaceDTO[] dtos=new PlaceDTO[5];
	private int index=0;
	@Override
	public boolean save(PlaceDTO dto) {
		if(this.index>=this.dtos.length) {
			System.err.println("Place Exceeded...");
			throw new StorageFullException("PlaceDTO Exceeded...");
		}
		this.dtos[this.index]=dto;
		this.index++;
		return true;
	}

}
