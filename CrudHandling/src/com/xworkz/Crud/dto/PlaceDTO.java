package com.xworkz.Crud.dto;

public class PlaceDTO extends AbstractAuditDTO{
	
	private String name;
	private String famousFor;
	private Double entryFees;
	private String state;
	private String Country;
	
	public PlaceDTO() {
		
	}

	public PlaceDTO(String name, String famousFor, Double entryFees, String state, String country, String createdBy, String updatedBy) {
		super(createdBy, updatedBy);
		this.name = name;
		this.famousFor = famousFor;
		this.entryFees = entryFees;
		this.state = state;
		Country = country;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", famousFor=" + famousFor + ", entryFees=" + entryFees + ", state=" + state
				+ ", Country=" + Country + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public Double getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(Double entryFees) {
		this.entryFees = entryFees;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
	
	
	
	
	

}
