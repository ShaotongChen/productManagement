package com.cogent.employeemanagementsystem;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.cogent.employeemanagementsystem.exception.InvalidSalaryExcception;
import com.cogent.employeemanagementsystem.model.Employee;

public class Main_hashcode {
public static void main(String[] args) {
	
	
	
	
	
	
	
	
	
	Employee employee=null;
	Employee employee2=null;
	Employee employee3=null;
	
		try {
			employee = new Employee("0001","Shao1","Chen1",100.0f,"IL");
		} catch (InvalidSalaryExcception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			employee2 = new Employee("0001","Shao1","Chen1",100.0f,"IL");
		} catch (InvalidSalaryExcception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			employee3 = new Employee("0003","Shao3","Chen3",10000.0f,"IL");
		} catch (InvalidSalaryExcception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	System.out.println(Integer.toHexString(employee.hashCode()));
	System.out.println(Integer.toHexString(employee2.hashCode()));
	System.out.println(Integer.toHexString(employee3.hashCode()));
			
			Set<Employee> employees=new LinkedHashSet<>();
			
			employees.add(employee);
			employees.add(employee2);
			employees.add(employee3);
			
			for (Employee employee4 : employees) {
				System.out.println(employee4);
			}
				
			
	
	
	
}
}
