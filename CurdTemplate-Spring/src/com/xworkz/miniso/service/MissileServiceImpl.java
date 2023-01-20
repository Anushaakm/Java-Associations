package com.xworkz.miniso.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.miniso.dto.MissileDTO;
import com.xworkz.miniso.repository.MissileRepo;

import io.quarkus.hibernate.validator.runtime.jaxrs.QuarkusRestViolationExceptionMapper.ViolationReport.Violation;
@Component
public class MissileServiceImpl implements MissileService {
	@Autowired
private Validator validator;
private MissileRepo missileRepo;

public MissileServiceImpl(MissileRepo missileRepo) {
	this.missileRepo=missileRepo;
	System.out.println("created service by passing repo from spring");
	
}
	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("validateAndSave started..");
		System.out.println(dto);
		
		Set<ConstraintViolation<MissileDTO>> violations=validator.validate(dto);
		if(!violations.isEmpty())
		{
			System.out.println("There are validation errors");
			violations.forEach(e->System.out.println(e.getMessage()));
			return true;
		}else {
			System.out.println("data is Valid...");
			boolean saved=missileRepo.save(dto);
			return saved;
			
		}
		
	}

}
