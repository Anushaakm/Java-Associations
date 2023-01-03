package com.xworkz.Stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.Stream.constant.Type;
import com.xworkz.Stream.dto.DataBaseVendorDTO;

public class DatabaseRunner {

	public static void main(String[] args) {
		Collection<DataBaseVendorDTO> dbDTO=new ArrayList<DataBaseVendorDTO>();
		dbDTO.add(new DataBaseVendorDTO("Oracle Database", "Oracle",Type.Oracle, "TB", 500));
		dbDTO.add(new DataBaseVendorDTO("MySQL Database", "MYSQL",Type.MYSQL, "TB", 20));
		dbDTO.add(new DataBaseVendorDTO("IBM Database", "IBM",Type.NoSQL, "TB", 500));
		
		System.out.println("Convert developed by to uppercase and print all the names ");
		
		dbDTO.stream()
		//.filter(e->e.getName())
		.map(dto->dto.getDevelopedBy().toUpperCase())
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto));
		
		System.out.println("Print name ");
		dbDTO.stream()
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto.getName()));
		
		System.out.println("Licence cost less than 100 and print types ");
		dbDTO.stream()
		.filter(dto->dto.getLicenseCost()<100)
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto.getType()));

		System.out.println("Licence cost less than 100 and print types ");
		dbDTO.stream()
		.filter(dto->dto.getLicenseCost()<100)
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto.getType()));
		
		
	}

}
