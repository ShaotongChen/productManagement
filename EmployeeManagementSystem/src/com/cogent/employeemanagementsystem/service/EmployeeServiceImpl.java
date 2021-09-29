package com.cogent.employeemanagementsystem.service;

import java.io.IOException;
import java.util.List;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.repository.EmployeeRepository;
import com.cogent.employeemanagementsystem.repository.EmployeeRepositoryALImpl;
import com.cogent.employeemanagementsystem.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService{
EmployeeRepository employeeRepository= EmployeeRepositoryALImpl.getInstance();
//are we consuming repo
// loos
public String addEmployee(Employee employee) {
	
	return employeeRepository.addEmployee(employee);
}
public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
	return employeeRepository.getEmployeeByID(id);
}
public List<Employee> getEmployees() {
	return employeeRepository.getEmployees();
}
public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {
	return employeeRepository.deleteEmployeeById(id);
}

private static EmployeeService employeeService;
private EmployeeServiceImpl() {}
public static EmployeeService getInstance() {
	if(employeeService==null) {
		employeeService = new EmployeeServiceImpl();
		return employeeService;
	}
	return employeeService; 
}
@Override
public void deleteAllEmployees() {
	employeeRepository.deleteAllEmployees();
	
}
@Override
public Employee getEmployeeByID(String id) throws IdNotFoundException, IOException {
	return employeeRepository.getEmployeeByID(id);
}
@Override
public String upddateEmployee(String id, Employee employee) throws IdNotFoundException, IOException {
	return employeeRepository.upddateEmployee(id, employee);
}
}
