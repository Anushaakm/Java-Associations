package com.xworkz.terrorist.boot;

import com.xworkz.terrorist.Service.TerroristService;
import com.xworkz.terrorist.Service.TerroristServiceImpl;
import com.xworkz.terrorist.dto.TerroristDTO;

public class Runner {

	public static void main(String[] args) {
		TerroristDTO dto =new TerroristDTO();
		dto.setName("SRISHAM");
		dto.setAge(24);
		System.out.println(dto);
		
		TerroristService service=new TerroristServiceImpl();
		service.saveAndValidate(dto);
	}
}
