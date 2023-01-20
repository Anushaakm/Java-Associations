package com.xworkz.miniso.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.miniso.dto.ResortDTO;
import com.xworkz.miniso.repository.ResortRepo;
@Component
public class ResortServiceImpl implements ResortService {
	@Autowired
	private Validator validator;
	private ResortRepo resortRepo;
	
	public ResortServiceImpl(ResortRepo resortRepo) {
		this.resortRepo=resortRepo;
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("ValidateAndSave started..");
		System.out.println(dto);
		Set<ConstraintViolation<ResortDTO>> violations=validator.validate(dto);
		if(!violations.isEmpty()) {
			System.err.println("there are validation errors");
			violations.forEach(e->System.out.println(e.getMessage()));
			return true;
		}else {
			System.out.println("Data is valid");
			boolean saved=resortRepo.save(dto);
			return saved;
		}
		
	}

}
