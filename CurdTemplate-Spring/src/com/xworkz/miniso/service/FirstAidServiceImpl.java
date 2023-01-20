package com.xworkz.miniso.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.miniso.dto.FirstAidDTO;
import com.xworkz.miniso.repository.FirstAidRepo;
@Component
public class FirstAidServiceImpl implements FirstAidService {
	@Autowired
	private Validator validator;	//init using property
	private FirstAidRepo firstAidRepo;//init using constroctor
	@Autowired
	public FirstAidServiceImpl(FirstAidRepo firstAidRepo) {
		this.firstAidRepo=firstAidRepo;
		System.out.println("created service by passing repo.....from spring... ");
	}
	
	
	@Override
	public boolean validateAndSave(FirstAidDTO dto) {
		System.out.println("validated and save starts");
		System.out.println(dto);
		
		
		Set<ConstraintViolation<FirstAidDTO>> violations=validator.validate(dto);
		
		
		if(!violations.isEmpty()) {
			System.out.println("There are validation error");
			violations.forEach(e->System.out.println(e.getMessage()));
			return false;
			
		}else {
			System.out.println("Data is valid");
			boolean saved=firstAidRepo.save(dto);
			return saved;
		}
		
	}

}
