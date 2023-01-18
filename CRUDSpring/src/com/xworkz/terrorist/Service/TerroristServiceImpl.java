package com.xworkz.terrorist.Service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.terrorist.dto.TerroristDTO;

public class TerroristServiceImpl implements TerroristService {

	@Override
	public boolean saveAndValidate(TerroristDTO dto) {
	System.out.println("executing validation and save start");
	System.out.println("Dto passes: "+dto);
	
	ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	Validator validator=factory.getValidator();
	Set<ConstraintViolation<TerroristDTO>> violations=validator.validate(dto);
	if(!violations.isEmpty()) {
		System.out.println("Error is there");
		violations.forEach(c-> System.err.println(c.getMessage()));
		return false;
	}
	
		return true;
	}

	
}
