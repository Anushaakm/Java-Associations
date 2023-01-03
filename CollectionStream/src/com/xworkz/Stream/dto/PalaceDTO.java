package com.xworkz.Stream.dto;

import java.io.Serializable;

public class PalaceDTO implements Serializable {

	private String name;
	private String location;
	private String builtBy;
	private boolean destroyed;
	private Double visitingFees;

	public PalaceDTO() {
		super();
	}

	public PalaceDTO(String name, String location, String builtBy, boolean destroyed, Double visitingFees) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.destroyed = destroyed;
		this.visitingFees = visitingFees;
	}

	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", destroyed="
				+ destroyed + ", visitingFees=" + visitingFees + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuiltBy() {
		return builtBy;
	}

	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public Double getVisitingFees() {
		return visitingFees;
	}

	public void setVisitingFees(Double visitingFees) {
		this.visitingFees = visitingFees;
	}

}
