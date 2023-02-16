package com.xworkz.valentine.Service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.valentine.Repository.ValentineRepository;
import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.entity.ValentineEntity;

@Service

public class ValentineServiceImpl implements ValentineService {
	@Autowired
	private ValentineRepository valentineRepository;
	
	public ValentineServiceImpl() {
		System.out.println("Create ValentineServiceImpl ");
	}

	@Override
	public Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("constraintViolations exist return constraintViolations");
			return violations;
		} else {
			System.out.println("constraintViolations does not exist data is good");
			ValentineEntity entity=new ValentineEntity();
			entity.setName(dto.getName());
			entity.setValentineName(dto.getValentineName());
			entity.setPlace(dto.getPlace());
			entity.setGift(dto.getGift());
			boolean saved=this.valentineRepository.save(entity);
			System.out.println("Entity data is saved "+saved);
			
			return Collections.emptySet();
		}
	

	}

}
