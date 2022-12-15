package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.HelmetDTO;

public class HelmetRepositoryImpl implements HelmetRepository {
	private HelmetDTO[] dtos=new HelmetDTO[5];
	private int index=0;
	
	@Override
	public boolean save(HelmetDTO dto) {
	if(this.index>=this.dtos.length) {
		System.err.println("Storage is full");
		return false;
	}
	this.dtos[this.index]=dto;
	this.index++;
		return true;
	}

}
