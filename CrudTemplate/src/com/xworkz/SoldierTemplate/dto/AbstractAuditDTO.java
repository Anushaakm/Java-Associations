package com.xworkz.SoldierTemplate.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AbstractAuditDTO implements Serializable {
	private String createdBy;
	private LocalDateTime createdAt;
	private String updatedBy;
	private LocalDateTime updatedAt;
}
