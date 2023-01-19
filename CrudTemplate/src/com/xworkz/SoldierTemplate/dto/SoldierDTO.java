package com.xworkz.SoldierTemplate.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SoldierDTO extends AbstractAuditDTO {
	@NotNull
	@NotBlank
	@Size(min=3,max=20,message="Give the valid name")
	private String name;
	@Min(value=0,message = "Give valid id")
	@Max(value=1000,message = "Give valid id")
	private int id;
	@NotNull
	@NotBlank
	@Size(min=3,max=20,message="Give the valid rank")
	private String rank;
	@NotNull
	@NotBlank
	@Size(min=3,max=20,message="Give the valid batallion")
	private String batallion;
	@NotNull
	@NotBlank
	@Size(min=3,max=20,message="Give the valid country")
	private String country;
}
