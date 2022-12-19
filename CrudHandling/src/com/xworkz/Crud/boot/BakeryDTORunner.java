package com.xworkz.Crud.boot;

import com.xworkz.Crud.dto.BakeryDTO;
import com.xworkz.Crud.exception.InvalidNameDataException;
import com.xworkz.Crud.repository.BakeryRepository;
import com.xworkz.Crud.repository.BakeryRepositoryImpl;
import com.xworkz.Crud.service.BakeryService;
import com.xworkz.Crud.service.BakeryServiceImpl;

public class BakeryDTORunner {
	BakeryDTO bakeryDTO;

	public static void main(String[] args) {
		BakeryDTO bakeryDTO = new BakeryDTO("Kanthi", "Lakshmi bazar", 45.5D, "Mysore Pak", "Anusha", "System");
		BakeryRepository bakeryRepository = new BakeryRepositoryImpl();
		BakeryService bakeryService = new BakeryServiceImpl(bakeryRepository);

		try {
			System.out.println("try block");
			bakeryService.validateAndSave(bakeryDTO);
		} catch (InvalidNameDataException e) {
			// e.printStackTrace();
		}

	}

}
