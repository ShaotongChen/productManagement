package com.cogent.employeemanagementsystem.model;

import com.cogent.employeemanagementsystem.exception.InvalidSalaryExcception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Manager extends Employee {
	
	private String managerId;
	private float projectAllow;
	
	@Override
	public float calculateSalary() {
		// TODO Auto-generated method stub
		return 3000;
	}
	public Manager() throws InvalidSalaryExcception {
		this("","","",1000.0f,100.0f,"");
	}
	public Manager(String empId, String firstName, String lastName, 
			float empSalary, float projectAllow, String managerId) throws InvalidSalaryExcception {
		super(empId,firstName,lastName,empSalary, "IL"); // it will give a call to contructor from parent class
		this.managerId="manager";
		this.projectAllow=projectAllow;
	}
}
