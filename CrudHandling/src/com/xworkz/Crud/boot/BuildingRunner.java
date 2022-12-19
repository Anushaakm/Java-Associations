package com.xworkz.Crud.boot;

import com.xworkz.Crud.dto.BuildingDTO;
import com.xworkz.Crud.exception.InvalidNameDataException;
import com.xworkz.Crud.repository.BuildingRepository;
import com.xworkz.Crud.repository.BuildingRepositoryImpl;
import com.xworkz.Crud.service.BuildingService;
import com.xworkz.Crud.service.BuildingServiceImpl;

public class BuildingRunner {
	BuildingDTO buildingDTO;

	public static void main(String[] args) {
		BuildingDTO buildingDTO = new BuildingDTO("MaruluSiddeshwara", "#1234", 2, false, "House", true, "Anusha",
				"System");
		BuildingRepository repository1 = new BuildingRepositoryImpl();
		BuildingService buildingService = new BuildingServiceImpl(repository1);

		try {
			System.out.println("After Validation");
			buildingService.SaveAndValidate(buildingDTO);
		} catch (InvalidNameDataException e) {
			// e.printStackTrace();
		}
	}
}
