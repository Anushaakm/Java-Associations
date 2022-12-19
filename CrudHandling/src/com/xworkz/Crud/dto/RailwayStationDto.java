package com.xworkz.Crud.dto;

public class RailwayStationDto extends AbstractAuditDTO {
	private String name;
	private int noOfPlatforms;
	private String area;
	private double ticketPrice;

	public RailwayStationDto() {
	}

	@Override
	public String toString() {
		return "RailwayStationDto [name=" + name + ", noOfPlatforms=" + noOfPlatforms + ", area=" + area
				+ ", ticketPrice=" + ticketPrice + ", toString()=" + super.toString() + "]";
	}

	public RailwayStationDto(String name, int noOfPlatforms, String area, double ticketPrice, String createdBy,
			String updatedBy) {
		super(createdBy, updatedBy);
		this.name = name;
		this.noOfPlatforms = noOfPlatforms;
		this.area = area;
		this.ticketPrice = ticketPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPlatforms() {
		return noOfPlatforms;
	}

	public void setNoOfPlatforms(int noOfPlatforms) {
		this.noOfPlatforms = noOfPlatforms;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	

}
