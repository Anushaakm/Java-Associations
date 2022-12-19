package com.xworkz.Crud.dto;

public class BuildingDTO extends AbstractAuditDTO {
	private String name;
	private String number;
	private int floors;
	private boolean lift;
	private String type;
	private boolean parking;
	
	public BuildingDTO() {
		
	}

	public BuildingDTO(String name, String number, int floors, boolean lift, String type, boolean parking, String createdBy, String updatedBy) {
		super(createdBy, updatedBy);
		this.name = name;
		this.number = number;
		this.floors = floors;
		this.lift = lift;
		this.type = type;
		this.parking = parking;
	}

	@Override
	public String toString() {
		return "BuildingDTO [name=" + name + ", number=" + number + ", floors=" + floors + ", lift=" + lift + ", type="
				+ type + ", parking=" + parking + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public boolean isLift() {
		return lift;
	}

	public void setLift(boolean lift) {
		this.lift = lift;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}
	

	
}
