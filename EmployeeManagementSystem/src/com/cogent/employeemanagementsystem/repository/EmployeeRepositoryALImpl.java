package com.cogent.employeemanagementsystem.repository;

import java.io.IOException;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;
import java.util.*;
public class EmployeeRepositoryALImpl implements EmployeeRepository {
	
	//singleton DP(default parameter)
	private static EmployeeRepository employeeRepository;
	private EmployeeRepositoryALImpl() {
		
		
	}
	public static EmployeeRepository getInstance() {
		if(employeeRepository==null) {
			employeeRepository= new EmployeeRepositoryALImpl();
			return employeeRepository;
		}
		return employeeRepository;
	}
	
	private Set<Employee> employees = new HashSet<>();
	
	//16 employees
	//when we will add 11th one then it will increase the size automatically
	// self growable
	//<Employee>===> we are informing what we will hold only employee type objects.
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		boolean status= employees.add(employee);
		if(status) {

		return "success";}
		else return "fail";
	}

	@Override
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {
		
		Employee employee= this.getEmployeeByID(id);
		if(employee!=null) {
			if(employees.remove(employee)){
				return "success";
			}
			
		}return "the object is null";

	
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
employees.clear();
	}

	@Override
	public Employee getEmployeeByID(String id) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub
		//1. we need to traverse the arraylist
		for (Employee employee : employees) {
			if(employee!=null && id.equals(employee.getEmployeeID()))
				return employee;
			
		}
		
		//2. we need to use java 8 feature
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		//AL==> array
		//Employee[] employee= new Employee[employees.size()];
		//set==>list.
		return new ArrayList<>(employees);
	}

	@Override
	public String upddateEmployee(String id, Employee employee) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isEmployeeExist(String Id) {
		// TODO Auto-generated method stub
		for (Employee employee : employees) {
			if(Id.equals(employee.getEmployeeID())) {
				return true;
			}
		}
		return false;
	}

}
