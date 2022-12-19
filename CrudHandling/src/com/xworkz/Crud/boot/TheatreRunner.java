package com.xworkz.Crud.boot;

import com.xworkz.Crud.dto.TheatreDTO;
import com.xworkz.Crud.exception.InvalidNameDataException;
import com.xworkz.Crud.repository.TheatreRepository;
import com.xworkz.Crud.repository.TheatreRepositoryImpl;
import com.xworkz.Crud.service.TheatreService;
import com.xworkz.Crud.service.TheatreServiceImpl;

public class TheatreRunner {
	 TheatreDTO theatreDto;
	public static void main(String[] args) {
		TheatreDTO theatreDto=new TheatreDTO("Navarang", 4, "Rajajinagar","Avatar","Anusha","System");
		TheatreRepository theatreRepository=new TheatreRepositoryImpl();
		TheatreService theatreService=new TheatreServiceImpl(theatreRepository);
		try {
			System.out.println("try block");
			theatreService.saveAndValidate(theatreDto);
		} catch (InvalidNameDataException e) {
			//e.printStackTrace();
		}

	}

}
