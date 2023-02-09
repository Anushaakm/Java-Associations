package com.xworkz.bakery.Repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bakery.dto.BakeryDTO;
@Repository
public class BakeryRepositoryImpl implements BakeryRepository {
public BakeryRepositoryImpl() {
	System.out.println("Running : " + getClass().getSimpleName());
}
	@Override
	public boolean save(BakeryDTO dto) {
		System.out.println("Running save method in bakery repository");
		return false;
	}

}
