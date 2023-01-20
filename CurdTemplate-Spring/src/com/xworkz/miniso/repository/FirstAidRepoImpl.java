package com.xworkz.miniso.repository;

import org.springframework.stereotype.Component;

import com.xworkz.miniso.dto.FirstAidDTO;
@Component
public class FirstAidRepoImpl implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDTO dto) {
		System.out.println("Running save in repo");
		System.out.println(dto);
		return true;
	}

}
