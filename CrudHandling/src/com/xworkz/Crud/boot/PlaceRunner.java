package com.xworkz.Crud.boot;

import com.xworkz.Crud.dto.PlaceDTO;
import com.xworkz.Crud.exception.InvalidNameDataException;
import com.xworkz.Crud.repository.PlaceRepository;
import com.xworkz.Crud.repository.PlaceRepositoryImpl;
import com.xworkz.Crud.service.PlaceService;
import com.xworkz.Crud.service.PlaceServiceImpl;

public class PlaceRunner {
	PlaceDTO placedto;

	public static void main(String[] args) {
		PlaceDTO placeDTO = new PlaceDTO("Kodachadri", "Hill Station", 400D, "Karnata", "India", "Anusha", "System");
		PlaceRepository placeRepository = new PlaceRepositoryImpl();
		PlaceService placeService = new PlaceServiceImpl(placeRepository);
		try {
			System.out.println("try Block");
			placeService.saveAndValidate(placeDTO);
		} catch (InvalidNameDataException e) {
			// e.printStackTrace();
		}
	}

}
