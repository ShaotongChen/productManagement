package com.cogent.employeemanagementsystem.repository;

import java.io.IOException;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;

public interface EmployeeRepository {

	public String addEmployee(Employee employee);
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException;
	public void deleteAllEmployees();
	public Employee getEmployeeByID(String id) throws IdNotFoundException, IOException;
	public Employee[] getEmployees();
	public String upddateEmployee(String id, Employee employee) throws IdNotFoundException, IOException;
	}
