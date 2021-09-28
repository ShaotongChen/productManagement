package com.cogent.employeemanagementsystem;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.model.Manager;

public class InheritanceDemo {
	public static final float PI =3.14f;
	// static : only one copy
	//final : can't change the value.
	public final int a ;
	public int b;
public InheritanceDemo() {
	this.a = 0;
	

	// TODO Auto-generated constructor stub
}
	
	public static void main(String[] args) {
		
		
		
		
		
	}
}
		
		/*
		// TODO Auto-generated method stub
Manager manager= new Manager("Shaot","s","C",100.0f,100.0f,"Y");
Manager manager2= new Manager();
Employee manager3 = new Manager();

//parent typr : child type
//object's behavior completely depending on ref type
float salary= manager2.calculateSalary();
System.out.println("man id "+manager.getEmployeeID());
System.out.println("salary "+manager2.getEmpSalary());
System.out.println(salary);
System.out.println(manager3.calculateSalary());

Manager manager4 = (Manager) manager3;
System.out.println(manager4.getProjectAllow());

/*
 * projectManager pm = new ProjectManager();
 *E + M + PM 
 *Manager m = new ProjectManager()
 *E+M
 *Employee e= new ProjectManager()
 *E 
 */
		

