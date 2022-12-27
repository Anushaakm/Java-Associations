package com.xworkz.Crud.dto;

public class SanitizerDTO extends AbstractAuditDTO{
	private Integer id;
	private String brand;
	private Double price;
	private String colour;
	
	public SanitizerDTO() {
		System.out.println("Default constructor Sanitizer DTO");
	}

	public SanitizerDTO(Integer id, String brand, Double price, String colour,String createdBy, String updatedBy) {
		super(createdBy, updatedBy);
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "SanitizerDTO [id=" + id + ", brand=" + brand + ", price=" + price + ", colour=" + colour
				+ ", toString()=" + super.toString() + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	
}
