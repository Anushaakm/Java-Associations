package com.xworkz.Crud.service;

import com.xworkz.Crud.dto.RailwayStationDto;
import com.xworkz.Crud.exception.InvalidNameDataException;
import com.xworkz.Crud.repository.RailwayStationRepository;

public class RailwayStaionServiceImpl implements RailwayStaionService {
	private RailwayStationRepository repository;

	public RailwayStaionServiceImpl(RailwayStationRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(RailwayStationDto dto) throws InvalidNameDataException {
		System.out.println("validateing and saving railway stationdata" + dto);

		String name = dto.getName();
		int noOfPlatform = dto.getNoOfPlatforms();
		String area = dto.getArea();
		double platformTicketPrice = dto.getTicketPrice();

		boolean validName = false;
		boolean validNoOfPlatform = false;
		boolean validArea = false;
		boolean validplatfromTicketPrice = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("valid name");
			validName = true;

		} else {
			System.err.println("Invalid name");
		}

		if (noOfPlatform > 0) {
			System.out.println("valid noOfPlatform");
			validNoOfPlatform = true;
		} else {
			System.err.println("Invalid noOfPlatform");
		}

		if (area != null && area.length() > 4 && area.length() < 20) {
			System.out.println("valid area");
			validArea = true;
		} else {
			System.err.println("Invalid area");
		}

		if (platformTicketPrice > 0) {
			System.out.println("valid platformTicketPrice");
			validplatfromTicketPrice = true;
		} else {
			System.err.println("Invalid platformTicketPrice");
		}

		if (validName && validNoOfPlatform && validArea && validplatfromTicketPrice) {
			System.out.println("Data is valid can store");
			boolean saved = this.repository.save(dto);
			System.out.println("Data Saved sucess" + saved);
			return saved;
		}
		throw new InvalidNameDataException("Check the data you have passed");
		// return true;
	}

}
