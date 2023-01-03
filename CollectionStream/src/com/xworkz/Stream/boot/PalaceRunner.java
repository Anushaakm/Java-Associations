package com.xworkz.Stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.Stream.dto.PalaceDTO;

public class PalaceRunner {

	public static void main(String[] args) {
		Collection<PalaceDTO> palaceDTOs=new ArrayList();
		palaceDTOs.add(new PalaceDTO("Mysore","Mysore","Jayachamarajendra Wadeyar", false, -100D));
		palaceDTOs.add(new PalaceDTO("Bengalore","Bengalore","HH Pramoodadevi wadeyar", true, 100D));
		palaceDTOs.add(new PalaceDTO("Jayamahal","Bengalore","Jagirdar", false, -100D));
		palaceDTOs.add(new PalaceDTO("Rambagh","Jaipur","Rambagh", true, -100D));
		
		
		palaceDTOs.stream()//LOOP
		.filter((dto)->!dto.isDestroyed())//CONDITION
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto));
		
		
	}

}
