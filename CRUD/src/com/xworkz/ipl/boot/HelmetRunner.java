package com.xworkz.ipl.boot;

import com.xworkz.ipl.constant.Colour;
import com.xworkz.ipl.constant.Type;
import com.xworkz.ipl.dto.HelmetDTO;
import com.xworkz.ipl.repository.HelmetRepository;
import com.xworkz.ipl.repository.HelmetRepositoryImpl;
import com.xworkz.ipl.service.HelmetService;
import com.xworkz.ipl.service.HelmetServiceImpl;

public class HelmetRunner {

	public static void main(String[] args) {
		HelmetDTO helmetDTO=new HelmetDTO();
		helmetDTO.setBrand("Studds");
		helmetDTO.setColour(Colour.PINK);
		helmetDTO.setPrice(1500D);
		helmetDTO.setType(Type.FULL);
		helmetDTO.setCreatedBy("Anusha");
		helmetDTO.setCreatedDate(null);
		helmetDTO.setUpdatedBy("System");
		helmetDTO.setUpdatedDate(null);
		
		HelmetRepository repository =new HelmetRepositoryImpl();
		HelmetService helmetService=new HelmetServiceImpl(repository);
		boolean success=helmetService.ValidateAndSave(helmetDTO);
		System.out.println("success "+success);

	}

}
