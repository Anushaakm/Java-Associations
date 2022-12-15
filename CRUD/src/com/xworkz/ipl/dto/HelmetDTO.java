package com.xworkz.ipl.dto;

import java.time.LocalDate;

import com.xworkz.ipl.constant.Colour;
import com.xworkz.ipl.constant.Type;

public class HelmetDTO extends AbstractAuditDTO{
	private String brand;
	private Colour colour;
	private Double price;
	private Type type;
	
	public HelmetDTO() {
	}

	@Override
	public String toString() {
		return "HelmetDTO [brand=" + brand + ", colour=" + colour + ", price=" + price + ", type=" + type
				+ ", toString()=" + super.toString() + "]";
	}

	public String getBrand() {
		return brand;
	}
	

	public HelmetDTO(String brand, Colour colour, Double price, Type type, String createdBy, LocalDate createdDate, String updatedBy, LocalDate updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.brand = brand;
		this.colour = colour;
		this.price = price;
		this.type = type;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Colour getColour() {
		return colour;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	

}
