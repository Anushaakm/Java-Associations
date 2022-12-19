package com.xworkz.Crud.service;

import com.xworkz.Crud.dto.BakeryDTO;
import com.xworkz.Crud.dto.RailwayStationDto;
import com.xworkz.Crud.exception.InvalidNameDataException;
import com.xworkz.Crud.exception.StorageFullException;
import com.xworkz.Crud.repository.BakeryRepository;
import com.xworkz.Crud.repository.RailwayStationRepository;

public class BakeryServiceImpl implements BakeryService {
	private BakeryRepository repository;

	public BakeryServiceImpl(BakeryRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(BakeryDTO dto) throws InvalidNameDataException {
		System.out.println("Validating and saving bakery dto.."+dto);
		String name=dto.getName();
		String area=dto.getArea();
		Double price=dto.getPrice();
		String special=dto.getSpecial();
		

		boolean validName = false;
		boolean validPrice = false;
		boolean validArea = false;
		boolean validSpecial = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("valid name");
			validName = true;

		} else {
			System.err.println("Invalid name");
		}

		if (special != null && special.length() >= 4 && special.length() <= 20) {
			System.out.println("valid special");
			validSpecial = true;
		} else {
			System.err.println("Invalid special");
		}
		

		if (area != null && area.length() > 4 && area.length() < 20) {
			System.out.println("valid area");
			validArea = true;
		} else {
			System.err.println("Invalid area");
		}

		if (price > 0) {
			System.out.println("valid Price");
			validPrice = true;
		} else {
			System.err.println("Invalid Price");
		}

		if (validName && validSpecial && validArea && validPrice) {
			System.out.println("Data is valid can store");
			boolean saved = this.repository.save(dto);
			System.out.println("Data Saved sucess" + saved);
			return saved;
		}
		throw new InvalidNameDataException("Check the data you have passed");
		
		//return false;
	}

	

	

}


