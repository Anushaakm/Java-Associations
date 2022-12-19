package com.xworkz.Crud.repository;

import com.xworkz.Crud.dto.TheatreDTO;
import com.xworkz.Crud.exception.StorageFullException;

public class TheatreRepositoryImpl implements TheatreRepository {
	private TheatreDTO[] dtos=new TheatreDTO[5];
	private int index=0;
	@Override
	public boolean save(TheatreDTO dto) {
		if(this.index>=this.dtos.length) {
		System.out.println("Theatre Exceeded..");
		throw new StorageFullException("Theatre exceeded exception");
		
	}
		this.dtos[index]=dto;
		this.index++;
		return true;
	}
}
