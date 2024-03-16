package com.sim.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class simCards {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer simId;
	private String netWorkName;

	private Long emiNumber;

	private Integer mobileId;
}
