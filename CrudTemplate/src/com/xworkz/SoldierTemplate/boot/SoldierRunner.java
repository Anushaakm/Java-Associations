package com.xworkz.SoldierTemplate.boot;

import com.xworkz.SoldierTemplate.dto.SoldierDTO;
import com.xworkz.SoldierTemplate.repository.SoldierRepository;
import com.xworkz.SoldierTemplate.repository.SolierRepositoryImpl;
import com.xworkz.SoldierTemplate.service.SoldierService;
import com.xworkz.SoldierTemplate.service.SoldierServiceImpl;


public class SoldierRunner {

	public static void main(String[] args) {
		SoldierDTO dto =new SoldierDTO("Harsha",5,"Topper","punjab","India");
		System.out.println(dto);
		
		 SoldierServiceImpl service=new SoldierServiceImpl();
		 SoldierRepository repo=new SolierRepositoryImpl();
		service.setSoldierRepo(repo);
		 service.saveAndValidate(dto);
		
	}

}
