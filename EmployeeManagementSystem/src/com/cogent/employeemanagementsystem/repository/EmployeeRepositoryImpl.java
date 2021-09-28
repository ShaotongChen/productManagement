package com.cogent.employeemanagementsystem.repository;

import java.io.IOException;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository{

	private Employee[] employees = new Employee[10];
	int counter= -1;
	private static EmployeeRepository employeeRepository;
	private EmployeeRepositoryImpl() {
		
		
	}
	public static EmployeeRepository getInstance() {
		if(employeeRepository==null) {
			employeeRepository= new EmployeeRepositoryImpl();
			return employeeRepository;
		}
		return employeeRepository;
	}
	public String addEmployee(Employee employee) {
		if(counter>employees.length) {
			return "the array is full";
		}
		employees[++counter]= employee;
		return "success!";
	}
	public Employee getEmployeeByID(String id) throws IdNotFoundException, IOException {
		//to throw the checked exception to the caller
		
		for(Employee employee: employees) {
			if( employee!=null && id.equals(employee.getEmployeeID())) {
				
				return employee;
			}
			throw new IOException();
			
		}
		
		throw new IdNotFoundException("Id not found");
		// it will throw the exception
	}
	public Employee[] getEmployees() {
		return employees;
		
	}
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {
Employee employee= this.getEmployeeByID(id);
 if(employee !=null) {
	 System.out.println("we found it and try to delete it");
	if(this.getIndex(employee)!=-1) {
	 employees[this.getIndex(employee)]=null;
	return "we already deleted it";}
	else {
		return "not found";
	}
 }else {
		 return "not found";
 }
	}
 private int getIndex(Employee employee) {
	 for(int i=0; i<employees.length;i++) {
		 if(employees[i].equals(employee)) {
			 return i;
		 }
		 
	 }
	 return -1;
 }
@Override
public void deleteAllEmployees() {
	for(int i=0; i<employees.length; i++) {
		employees[i]=null;
	}
	
}

@Override
public String upddateEmployee(String id, Employee employee) throws IdNotFoundException, IOException {
	Employee temp= this.getEmployeeByID(id);
	if(temp != null) {
	employees[this.getIndex(temp)]=employee;	
		return "already updated!";
	}
	else {
	return "not found";	
	}
	
}
public Employee getEmployeeByName(String name) {
	for(int i=0; i<employees.length; i++) {
		if(
		name==employees[i].getFirstName()+employees[i].getLastName()) {
			return employees[i];
		}
	}
	return null;
}
	}

