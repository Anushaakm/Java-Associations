package com.xworkz.miniso.repository;

import org.springframework.stereotype.Component;

import com.xworkz.miniso.dto.MissileDTO;
@Component
public class MissileRepoImpl implements MissileRepo {

	@Override
	public boolean save(MissileDTO dto) {
		System.out.println("Running Save in repo..");
		System.out.println(dto);
		return true;
	}

}
