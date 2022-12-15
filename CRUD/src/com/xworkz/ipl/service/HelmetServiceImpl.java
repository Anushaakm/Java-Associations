package com.xworkz.ipl.service;

import com.xworkz.ipl.constant.Type;

import com.xworkz.ipl.constant.Colour;
import com.xworkz.ipl.dto.HelmetDTO;
import com.xworkz.ipl.repository.HelmetRepository;

public class HelmetServiceImpl implements HelmetService {
	
	HelmetRepository helmetRepository;

	public HelmetServiceImpl(HelmetRepository helmetRepository) {
		this.helmetRepository = helmetRepository;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean ValidateAndSave(HelmetDTO dto) {
		System.out.println("Running Validation..."+dto);
		String brand=dto.getBrand();
		Colour colour=dto.getColour();
		Double price=dto.getPrice();
		Type type=dto.getType();
		
		boolean validBrand=false;
		boolean validColour=false;
		boolean validPrice=false;
		boolean validType=false;
		
		if(brand!=null && brand.length()>=4 && brand.length()<=20)
		{
			System.out.println("valid brand..");
			validBrand=true;
		}else {
			System.out.println("Invalid brand");
		}
		
		
		if(colour!=null )
		{
			System.out.println("valid colour..");
			validColour=true;
		}else {
			System.out.println("Invalid colour");
		}
		
		if(price!=null && price>=100 && price<=2000)
		{
			System.out.println("valid price..");
			validPrice=true;
		}else {
			System.out.println("Invalid price");
			
		}
		
		if(type!=null )
		{
			System.out.println("valid type..");
			validType=true;
		}else {
			System.out.println("Invalid type");
			
		}
		if(validBrand && validColour && validPrice && validType) {
			System.out.println("HelmetDTO is valid, can save using repository");
			boolean saved=this.helmetRepository.save(dto);
			System.out.println(saved);
		}
		return true;
	}

}
