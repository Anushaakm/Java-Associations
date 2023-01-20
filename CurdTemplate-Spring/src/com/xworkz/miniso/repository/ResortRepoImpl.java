package com.xworkz.miniso.repository;

import org.springframework.stereotype.Component;

import com.xworkz.miniso.dto.ResortDTO;
@Component
public class ResortRepoImpl implements ResortRepo {

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("Running Resort data Save in repo ");
		System.out.println(dto);
		return true;
	}

}
