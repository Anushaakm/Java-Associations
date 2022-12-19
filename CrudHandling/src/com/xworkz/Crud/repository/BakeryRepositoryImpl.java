package com.xworkz.Crud.repository;

import com.xworkz.Crud.dto.BakeryDTO;
import com.xworkz.Crud.exception.StorageFullException;

public class BakeryRepositoryImpl implements BakeryRepository {

	private BakeryDTO[] dtos=new BakeryDTO[5];
	private int index=0;
	@Override
	public boolean save(BakeryDTO dto) {
		if(this.index>=this.dtos.length) {
			System.err.println("bakerysize is exceeded...");
			throw new StorageFullException("bakerysize is exceeded");
		}
		this.dtos[this.index]=dto;
		this.index++;
		
		return true;
	}
		
	}
	
	
	
