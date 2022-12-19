package com.xworkz.Crud.dto;

public class BakeryDTO extends AbstractAuditDTO{
	
	private String name;
	private String area;
	private Double price;
	private String special;
		
	public BakeryDTO() {
	}

	public BakeryDTO(String name, String area, Double price, String special, String createdBy, String updatedBy) {
		super(createdBy, updatedBy);
		this.name = name;
		this.area = area;
		this.price = price;
		this.special = special;
	}


	@Override
	public String toString() {
		return "BakeryDTO [name=" + name + ", area=" + area + ", price=" + price + ", special=" + special + ", toString()=" + super.toString() + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getSpecial() {
		return special;
	}


	public void setSpecial(String special) {
		this.special = special;
	}

}
