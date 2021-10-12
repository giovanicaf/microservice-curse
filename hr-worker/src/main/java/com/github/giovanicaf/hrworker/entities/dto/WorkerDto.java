package com.github.giovanicaf.hrworker.entities.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkerDto{

	private Long id;
	private String name;
	private Double dailyIncome;
	
}
