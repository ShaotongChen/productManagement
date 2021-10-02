package com.cogent.employeemanagementsystem;

import java.util.Comparator;
import java.util.TreeSet;

import com.cogent.employeemanagementsystem.exception.InvalidSalaryExcception;
import com.cogent.employeemanagementsystem.model.Employee;

public class TreeSet_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Comparator<Employee> comparator= new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return Float.valueOf(o1.getEmpSalary()).compareTo(Float.valueOf(o2.getEmpSalary()));
			}
			
		};
		Comparator<Employee> comparator1= new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return Float.valueOf(o1.getEmpSalary()).compareTo(Float.valueOf(o2.getEmpSalary()));
			}
			
		};
		//anonymous class
		
		TreeSet<Employee> employees= new TreeSet<>(comparator);
		try {
			employees.add(new Employee("0001", "Shaotong", "Chen", 1000.f, "IL"));
			employees.add(new Employee("0002", "Shaoton", "Chen1", 1000.f, "IL"));
			employees.add(new Employee("0003", "Shaoto", "Chen2", 1000.f, "IL"));
			//employees.add(null);
			//treeset not allow to addd null
			System.out.println(employees);
		} catch (InvalidSalaryExcception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(ClassCastException e) {
			
			System.out.println("exception caugth"+e);
		}
		
		
		//reeSet<String> set= new TreeSet();

		
		/*
		 * set.add("Shao"); set.add("computer"); set.add("Chen"); set.add("Tong");
		 * set.add("levi"); set.add("Shao");
		 * 
		 * System.out.println(set);
		 */
		//TreeSet<String> set1= new TreeSet<>();
//		TreeSet<String> set2= new TreeSet<String>();
		

	}

}
