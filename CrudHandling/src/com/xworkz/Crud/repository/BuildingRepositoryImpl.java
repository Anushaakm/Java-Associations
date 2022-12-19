package com.xworkz.Crud.repository;

import com.xworkz.Crud.dto.BuildingDTO;
import com.xworkz.Crud.exception.StorageFullException;


public class BuildingRepositoryImpl implements BuildingRepository {
	private BuildingDTO[] dtos=new BuildingDTO[5];
	private int index=0;
	@Override
	public boolean save(BuildingDTO dto) {
		if(this.index>=this.dtos.length) {
			System.err.println("Building size is exceeded...");
			throw new StorageFullException("Building size is exceeded");
		}
		this.dtos[this.index]=dto;
		this.index++;
		return true;
		
	}

}
