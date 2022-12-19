package com.xworkz.Crud.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class AbstractAuditDTO implements Serializable {

	private String createdBy;
	private LocalDate createdDate = LocalDate.now();
	private String updatedBy;
	private LocalDate updatedDate = LocalDate.now();

	public AbstractAuditDTO() {
		System.out.println("Created default constructor of auditDTo");
	}

	@Override
	public String toString() {
		return "AbstractAuditDTO [createdBy=" + createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + "]";
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public AbstractAuditDTO(String createdBy, String updatedBy) {
		super();
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		
	}

}
