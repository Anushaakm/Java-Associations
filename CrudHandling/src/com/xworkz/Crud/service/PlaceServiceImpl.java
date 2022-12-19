package com.xworkz.Crud.service;

import com.xworkz.Crud.dto.PlaceDTO;
import com.xworkz.Crud.exception.InvalidNameDataException;
import com.xworkz.Crud.repository.PlaceRepository;
import com.xworkz.Crud.repository.PlaceRepositoryImpl;

public class PlaceServiceImpl implements PlaceService {
	private PlaceRepository placeRepository;
	
	public PlaceServiceImpl(PlaceRepository placeRepository) {
		this.placeRepository=placeRepository;
	}
	@Override
	public boolean saveAndValidate(PlaceDTO dto) throws InvalidNameDataException {
		System.out.println("validate and save place Dto"+dto);
		String name=dto.getName();
		String famousFor=dto.getFamousFor();
		Double entryFees=dto.getEntryFees();
		String state=dto.getState();
		String country=dto.getCountry();
		
		boolean validName = false;
		boolean validFamousFor = false;
		boolean validEntryFees = false;
		boolean validState = false;
		boolean validCountry = false;
		
		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("valid name");
			validName = true;

		} else {
			System.err.println("Invalid name");
		}

		if (famousFor != null && famousFor.length() >= 4 && famousFor.length() <= 20) {
			System.out.println("valid famousFor");
			validFamousFor = true;
		} else {
			System.err.println("Invalid famousFor");
		}
		

		if (entryFees >0) {
			System.out.println("valid entryFees");
			validEntryFees = true;
		} else {
			System.err.println("Invalid entryFees");
		}

		if (state != null && state.length() >= 4 && state.length() <= 20) {
			System.out.println("valid state");
			validState = true;
		} else {
			System.err.println("Invalid state");
		}
		
		if (country != null && country.length() >= 4 && country.length() <= 20) {
			System.out.println("valid Country");
			validCountry = true;
		} else {
			System.err.println("Invalid Country");
		}

		if (validName && validFamousFor && validEntryFees && validState && validCountry) {
			System.out.println("Data is valid can store");
			boolean saved = this.placeRepository.save(dto);
			System.out.println("Data Saved sucess" + saved);
			return saved;
		}
		throw new InvalidNameDataException("Check the data you have passed");
		
		//return false;
		
		
	}

}
