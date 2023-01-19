package com.xworkz.SoldierTemplate.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.SoldierTemplate.dto.SoldierDTO;
import com.xworkz.SoldierTemplate.repository.SoldierRepository;

public class SoldierServiceImpl implements SoldierService {
private SoldierRepository soldierRepo;
	public SoldierServiceImpl() {
		System.out.println("Created soldierServiceImpl no-arg constructor...");
	}

	 public void setSoldierRepo(SoldierRepository soldierRepo) {
		this.soldierRepo = soldierRepo;
	}
	
	@Override
	public boolean saveAndValidate(SoldierDTO dto) {
		System.out.println("Excecuting saving and validation start");
		System.out.println(dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("Error is there");
			violations.forEach(c -> System.err.println(c.getMessage()));
			return false;
		}else {
			System.out.println("Data is valid..");
			boolean saved=soldierRepo.save(dto);
			System.out.println("Dto saved using repo"+saved);
			return saved;
			
		}

	}

}
