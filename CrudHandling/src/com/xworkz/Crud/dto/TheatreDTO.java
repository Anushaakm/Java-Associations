package com.xworkz.Crud.dto;

public class TheatreDTO extends AbstractAuditDTO{
	private String name;
	private int noOfShow;
	private String area;
	private String movie;
	@Override
	public String toString() {
		return "TheatreDTO [name=" + name + ", noOfShow=" + noOfShow + ", area=" + area + ", movie=" + movie
				+ ", toString()=" + super.toString() + "]";
	}
	public TheatreDTO() {
		
	}
	public TheatreDTO(String name, int noOfShow, String area, String movie, String createdBy,
			String updatedBy) {
		super(createdBy, updatedBy);
		this.name = name;
		this.noOfShow = noOfShow;
		this.area = area;
		this.movie = movie;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfShow() {
		return noOfShow;
	}
	public void setNoOfShow(int noOfShow) {
		this.noOfShow = noOfShow;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	
	
}
