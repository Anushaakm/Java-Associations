package com.xworkz.Crud.dto;

public class GameDTO extends AbstractAuditDTO{

	private String name;
	private String type;
	private Integer Players;
	
	public GameDTO() {
		System.out.println("Default constructor");
	}

	public GameDTO(String name, String type, Integer players, String createdBy, String updatedBy) {
		super(createdBy, updatedBy);
		this.name = name;
		this.type = type;
		Players = players;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPlayers() {
		return Players;
	}

	public void setPlayers(Integer players) {
		Players = players;
	}

	@Override
	public String toString() {
		return "GameDTO [name=" + name + ", type=" + type + ", Players=" + Players + ", toString()=" + super.toString()
				+ "]";
	}
	
	public boolean equals(Object obj) {
		if(obj!=null) {
		if(obj instanceof GameDTO) {
			GameDTO dto=(GameDTO) obj;
			if(dto.name.equals(this.name)) {
				System.out.println("name is matching"+dto.name);
				return true;
			}
			}
		}
		return false;
	}
}
