package com.project.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PLAN_MASTER")
public class PlanMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PLAN_ID")
	private Integer planId;

	@Column(name = "PLAN_NAME")
	private String planName;

	@Column(name = "PLAN_START_DATE")
	private LocalDate startDate;

	@Column(name = "PLAN_END_DATE")
	private LocalDate endDate;

	@Column(name = "CATEGORY_ID")
	private Integer categoryId;
	
	@Column(name = "ACTIVE_SW")
	private String activeSw;
	
	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@Column(name = "UPDATED_BY")
	private String updatedBy;
	
	@CreationTimestamp
	 @Column(name="CREATED_DATE",updatable = false)
	private LocalDateTime createdDate;
	@UpdateTimestamp
	@Column(name="UPDATED_DATE",insertable = false)
	private LocalDateTime updatedDate;

}
