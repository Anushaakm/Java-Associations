package com.xworkz.ipl.boot;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.xworkz.ipl.constant.PizzaSize;
import com.xworkz.ipl.dto.PizzaDTO;
import com.xworkz.ipl.service.PizzaService;
import com.xworkz.ipl.service.PizzaServiceImpl;

public class Runner {
public static void main(String[] args) {
	PizzaDTO pizzaDTO=new PizzaDTO();
	pizzaDTO.setName("Veg loaded");
	pizzaDTO.setCompany("Pizza Hut");
	pizzaDTO.setPrice(150.0);
	pizzaDTO.setCheese(true);
	pizzaDTO.setSize(PizzaSize.SMALL);
	pizzaDTO.setQuantity(4);
	pizzaDTO.setType("VEG");
	pizzaDTO.setCreatedBy("Anusha");
	pizzaDTO.setCreatedDate(LocalDate.now());
	pizzaDTO.setUpdatedBy("System");
	pizzaDTO.setUpdatedDate(LocalDate.now());
	
	PizzaService pizzaService=new PizzaServiceImpl();
	boolean saved=pizzaService.validateAndSave(pizzaDTO);
	System.out.println(saved);
	
	
}
}
