package com.xworkz.hostel.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="hostel_table")
public class HostelDTO {
	@Column(name="id")
	@Id
	private Integer id;
	@Column(name="h_name")
	private String name;
	@Column(name="h_location")
	private String location;
	@Column(name="h_warden")
	private String warden;
	@Column(name="h_block")
	private String block;
	

	
}
