package com.xworkz.SoldierTemplate.repository;

import com.xworkz.SoldierTemplate.dto.SoldierDTO;

public class SolierRepositoryImpl implements SoldierRepository {
public SolierRepositoryImpl() {
	System.out.println("Created soldierRepoImpl using no-arg const...");
}
	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("Running save");
		System.out.println("Dto"+ dto);
		return false;
	}

}
