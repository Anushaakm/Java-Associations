package com.xworkz.Crud.boot;

import com.xworkz.Crud.dto.RailwayStationDto;
import com.xworkz.Crud.exception.InvalidNameDataException;
import com.xworkz.Crud.repository.RailwayStationRepository;
import com.xworkz.Crud.repository.RailwayStationRepositoryImpl;
import com.xworkz.Crud.service.RailwayStaionService;
import com.xworkz.Crud.service.RailwayStaionServiceImpl;

public class RailwayRunner {
	RailwayStationDto railwayStationDto;

	public static void main(String[] args) {

		RailwayStationDto railwayStationDto = new RailwayStationDto("Citradurga", 5, "ABCDE", 20D, "Anusha", "System");
		RailwayStationRepository repository = new RailwayStationRepositoryImpl();
		RailwayStaionService railwayService = new RailwayStaionServiceImpl(repository);
		try {
			System.out.println("try block");
			railwayService.validateAndSave(railwayStationDto);
		} catch (InvalidNameDataException e) {
			//e.printStackTrace();
		}
	}
}
