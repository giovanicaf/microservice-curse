package com.github.giovanicaf.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Payment implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	private String name; 
	private Double dailyIncome; 
	private Integer days; 

	public double getTotal() {
		return days * dailyIncome; 
	}
}
