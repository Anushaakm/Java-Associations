package com.xworkz.ipl.service;

import com.xworkz.ipl.constant.PizzaSize;
import com.xworkz.ipl.dto.PizzaDTO;

public class PizzaServiceImpl implements PizzaService {

	@Override
	public boolean validateAndSave(PizzaDTO dto) {
		System.out.println("Running validationAndSave" + dto);
		String name = dto.getName();
		String company = dto.getCompany();
		PizzaSize size = dto.getSize();
		boolean cheese = dto.isCheese();
		double price = dto.getPrice();
		String type = dto.getType();
		int quantity = dto.getQuantity();
		boolean validName = false;
		boolean validPrice = false;
		boolean validCompany = false;
		boolean validSize = false;
		boolean validCheese = false;
		boolean validType = false;
		boolean validQuantity = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("valid name" + name);
			validName = true;
		} else {
			System.err.println("Invalid name" + name);
		}

		if (company != null && company.length() >= 4 && company.length() <= 20) {
			System.out.println("valid company" + company);
			validCompany = true;
		} else {
			System.err.println("Invalid company" + company);
		}

		if (size != null) {
			System.out.println("valid size" + size);
			validSize = true;
		} else {
			System.err.println("Invalid size" + size);
		}

		if (price > 50 && price < 12000) {
			System.out.println("valid price" + price);
			validPrice = true;
		} else {
			System.err.println("Invalid price" + price);
		}

		if (quantity != 0 && quantity >= 3 && quantity <= 20) {
			System.out.println("valid quantity" + quantity);
			validQuantity = true;
		} else {
			System.err.println("Invalid quantity" + quantity);
		}

		if (type != null && type == "VEG" || type == "NON-VEG") {
			System.out.println("valid name" + name);
			validType = true;
		} else {
			System.err.println("Invalid name" + name);
		}

		return true;
	}

}
