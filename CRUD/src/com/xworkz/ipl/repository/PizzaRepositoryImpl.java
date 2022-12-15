package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.PizzaDTO;

public class PizzaRepositoryImpl implements PizzaRepository{
	private PizzaDTO[] pizzas=new PizzaDTO[10];
	private int iplIndex=0;
	@Override
	public boolean save(PizzaDTO dto) {
		System.out.println("Running save...");
		
		return false;
	}

}
