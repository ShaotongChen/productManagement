package com.cogent.employeemanagementsystem;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.exception.InvalidSalaryExcception;
import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;
import com.cogent.employeemanagementsystem.service.EmployeeServiceImpl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Main {

	public static int division(int a, int b) {
		int c = 0;
		try {
			c = a / b; // it will create am object of arithmetic exception
			// JVM will implicitly create the objects for all per defined runtime exception
			return c; // if division is done then return the result.
		} catch (ArithmeticException e) {
			// TODO: handle exception

		} finally {
			System.out.println("finally");// finally block code

		}
		return -1;
	}

	public static void main(String[] args) {
		
		
		
		  EmployeeService employeeService = EmployeeServiceImpl.getInstance();
////		  
////		  Employee employee = new Employee("shaotong", "shao","chen",100.0f,"IL","computer"); 
////		  Employee employee1 = new Employee("shaotong1", "shao","chen",100.0f,"IL","computer"); 
////		  Employee employee2 = new Employee("shaotong2", "shao","chen",100.0f,"IL","computer");
////		  Employee employee3 = new Employee("shaotong3","shao","chen",100.0f,"IL","computer"); 
////		  Employee employee4 = new Employee("shaotong4", "shao","chen",100.0f,"IL","computer"); 
////		  Employee employee5 = new Employee("shaotong5", "shao","chen",100.0f,"IL","computer");
////		  Employee employee6 = new Employee("shaotong6","shao","chen",100.0f,"IL","computer");
////		  Employee employee7 = new Employee("shaotong7", "shao","chen",100.0f,"IL","computer"); 
////		  Employee employee8 = new Employee("shaotong8", "shao","chen",100.0f,"IL","computer");
////		  Employee employee9 = new Employee("shaotong9", "shao","chen",100.0f,"IL","computer"); 
//		  employeeService.addEmployee(employee);
//		  
//		  employeeService.addEmployee(employee1);
//		  employeeService.addEmployee(employee2);
//		  employeeService.addEmployee(employee3);
//		  employeeService.addEmployee(employee4);
//		  employeeService.addEmployee(employee5);
//		  employeeService.addEmployee(employee6);
//		  employeeService.addEmployee(employee7);
//		  employeeService.addEmployee(employee8);
//		  
//		  employeeService.addEmployee(employee9);
//		  
//		  
//		  
//		  //System.out.println(employeeService.deleteEmployeeById("shaotong6"));
//		  
//		  try {
//			System.out.println(employeeService.deleteEmployeeById("shaotong8"));
//		} catch (IdNotFoundException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("sdf");
//		}
//		  List<Employee> employees = new ArrayList<>();
//				 employees= employeeService.getEmployees();
//		  //employeeService.deleteAllEmployees(); 
//		  //Employee employeeT= new Employee("sisi","add","min",1000.0f,"PA","management");
//		  //employeeService.upddateEmployee("shaotong8", employeeT); 
//		  for(Employee employe: employees)
//		  { System.out.println(employe); }
//		 
//		
//		
//		
//

	}
//	try {
//		Employee employee = new Employee("0001", "Shao", "Chen", 1000, "IL");
//	
//			employee.setEmpSalary(-5000.0f);
//		} catch (InvalidSalaryExcception e) {
//			// TODO Auto-generated catch block   
//			e.printStackTrace();
//		}

//		EmployeeService employeeService= EmployeeServiceImpl.getInstance();
//		try {
//			Employee employee= employeeService.getEmployeeByID("abc002");
//		} catch (IdNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
		/*
		 * try { FileOutputStream fileOutputStream= new FileOutputStream("abc.txt");
		 * fileOutputStream.write("abc".getBytes());
		 * 
		 * 
		 * }catch (FileNotFoundException e) { // TODO: handle exception
		 * e.printStackTrace();
		 * 
		 * } catch (value e) { // TODO: handle exception } catch (IOException e) { //
		 * TODO Auto-generated catch block e.printStackTrace();
		 * System.out.println("eee"); }
		 */
//		try {
//			//System.out.println(10/0);
//			String s= null;
//			System.out.println(s.concat("shen"));;
//			//s is not refering to object
//			//to call concat method we need object
//			//since object is not there and we are trying to call concat method
//			//then it will throw NPE(nullpointexception).
//		} 	
//		//Extreme child to top parent
//		// Exception should be end of catch 
//				catch (ArithmeticException e) {		
//					// TODO: handle exception
//			// if we use ArithmeticException, jVM will handle statement from try.
//			
//		}catch (NullPointerException e) {
//			// TODO: handle exception
//			System.out.println("caught NPE");
//		}
//	
//		catch (Exception e) {
//			// TODO: handle exception
//System.out.println("eeee");
//System.out.println(e.getClass().getName());
//		}
//		catch (Throwable e) {
//			// TODO: handle exception
//		}
//		//why no for object if object is able to handle it then everyclass is capable to 
//		//handle the exception 
//		//then what is diff between a normal class and exception class.
//
//		

}
/*
 * int result = division(10,5); System.out.println(result);
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
  /* int c, a=0, b=0; Scanner sc= new Scanner(System.in); //in ===> static
 * Ref===> used with className. //it is used to accept the value/ data from user
 * System.out.println("enter a & b values"); try { a = sc.nextInt(); b=
 * sc.nextInt(); c=a/b; System.out.println(c); } catch (ArithmeticException e) {
 * // TODO Auto-generated catch block e.printStackTrace();
 * System.out.println("exception occured");
 * System.out.println("plz, enter b value again"); b=sc.nextInt(); c=a/b;
 * System.out.println(c); } finally {
 * System.out.println("this is finally block10"); }
 * 
 * 
 * 
 * 
 * 
 * 
 */
