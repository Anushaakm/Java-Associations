package com.xworkz.Crud.service;

import com.xworkz.Crud.dto.BuildingDTO;
import com.xworkz.Crud.exception.InvalidNameDataException;
import com.xworkz.Crud.repository.BuildingRepository;

public class BuildingServiceImpl implements BuildingService {
	private BuildingRepository buildingRepository;
	
	public BuildingServiceImpl(BuildingRepository buildingRepository) {
		super();
		this.buildingRepository = buildingRepository;
	}
	
	@Override
	public boolean SaveAndValidate(BuildingDTO dto) throws InvalidNameDataException {
		System.out.println("Validating and saving place data" + dto);

		String name = dto.getName();
		String number=dto.getNumber();
		int floors = dto.getFloors();
		//boolean lift = dto.isLift();
		//boolean parking = dto.isParking();
		String type = dto.getType();

		boolean validNumber = false;
		boolean validFloor = false;
		boolean validType = false;
		boolean validName=false;
		boolean validlift=false;

		if (name != null && name.length() >= 4 && name.length() <= 40) {
			System.out.println("Valid no " + name);
			validName = true;
		} else {
			System.out.println("Invalid name");
		}

		if (floors > 0) {
			System.out.println("Valid floor");
			validFloor = true;
		} else {
			System.out.println("Invalid floor ");
		}
		if (type != null && type.length() >= 4 && type.length() <= 20) {
			System.out.println("Valid nearBy" + type);
			validType = true;
		} else {
			System.out.println("Invalid type ");
		}

		if ( validFloor && validType && validName) {
			System.out.println("Data is valid and can store ");
			boolean saved = this.buildingRepository.save(dto);
			System.out.println("data is saved successfully" + saved);
			return saved;
		}
		throw new InvalidNameDataException("Check the data you have passed");
		//return false;
	}

}
