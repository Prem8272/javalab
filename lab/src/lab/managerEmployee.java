package lab;

import java.util.Scanner;

class member{
	String name,dept,spec;
	double sal;
	int age; 
	long phnum;
	Scanner sc=new Scanner(System.in);//scanner class is used to asking user to input 
	
}
class manager extends member
{
	public void input() {
		System.out.println("--Input Manager Details--");
		System.out.println("Enter Name: ");
		name=sc.next();
		System.out.println("Enter Age: ");
		age=sc.nextInt();
		System.out.println("Enter Mob Number: ");
		phnum=sc.nextLong();
		System.out.println("Enter Specification: ");
		spec=sc.next();
		System.out.println("Enter Department: ");
		dept=sc.next();
		System.out.println("Enter Salary: ");
		sal=sc.nextDouble();
		System.out.println("--------------------------");
		
	}
	public void show()
	{
		System.out.println("----Details of Manager---");
		System.out.println();
		System.out.println("Manager Name: "+name);
		System.out.println("Manager Age: "+age);
		System.out.println("Manager Mob: "+phnum);
		System.out.println("Manager Specification: "+spec);
		System.out.println("Manager Post: "+dept);
		System.out.println("Manager Salary: "+sal);
		
	}
	
}
class emp extends member
{
	public void input() {
		System.out.println("--Input Employee Details--");
		System.out.println("Enter Name: ");
		name=sc.next();
		System.out.println("Enter Age: ");
		age=sc.nextInt();
		System.out.println("Enter Mob Number: ");
		phnum=sc.nextLong();
		System.out.println("Enter Specification: ");
		spec=sc.next();
		System.out.println("Enter Department: ");
		dept=sc.next();
		System.out.println("Enter Salary: ");
		sal=sc.nextDouble();
		System.out.println("--------------------------");
		
	}
	public void show()
	{
		System.out.println("----Details of Employee---");
		System.out.println();
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Age: "+age);
		System.out.println("Employee Mob: "+phnum);
		System.out.println("Employee Specification: "+spec);
		System.out.println("Employee Post: "+dept);
		System.out.println("Employee Salary: "+sal);
		
	}
}
public class managerEmployee {

	public static void main(String[] args) {
		manager m=new manager();//created object for the class manager
		emp e=new emp();//created object for the class employee
		m.input();//calling function
		m.show();//calling function
		e.input();//calling function
		e.show();//calling function

	}

}
