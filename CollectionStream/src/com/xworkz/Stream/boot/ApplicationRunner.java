package com.xworkz.Stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.Stream.dto.ApplictionDTO;

public class ApplicationRunner {

	public static void main(String[] args) {
		Collection<ApplictionDTO> appDTOs = new ArrayList();
		appDTOs.add(new ApplictionDTO("YouTube", 2.8, true, "Google", 0));
		appDTOs.add(new ApplictionDTO("Chrome", 4.0, true, "Google", 100));
		appDTOs.add(new ApplictionDTO("MSEdge", 2.8, true, "MS", 50));
		appDTOs.add(new ApplictionDTO("WhatsApp", 6.8, false, "Yahoo", 0));
		System.out.println("Applications that are free and developed by google");
		
		appDTOs.stream()
		.filter(dto -> dto.isFree())
		.filter(dto -> dto.getDevelopedBy().contains("Google"))
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));

		System.out.println("version > 5 and their names");
		appDTOs.stream()
		.filter((dto) -> dto.getVersion() > 5)
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e.getName()));
		
		

	}

}
