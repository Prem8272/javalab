package lab;

import java.util.Scanner;

class details
{
	String stdid,empid,fn,ln,course,dept,desg;
	double sal;
	int age;
	Scanner sc=new Scanner(System.in);//asking user to input
	
	public void input()
	{
		System.out.println("Enter First name: ");
		fn=sc.next();
		System.out.println("Enter Last name: ");
		ln=sc.next();
		System.out.println("Enter Age: ");
		age=sc.nextInt();
	}
	public void show()
	{
		
		System.out.println("Full Name: "+fn+""+ln);
		
		System.out.println("Age: "+age);
		
	}
		
}
class student extends details
{
	public void input() {
		System.out.println("Enter Student ID: ");
		stdid=sc.next();
		System.out.println("Enter Cousre Enrolled: ");
		course=sc.next();
		
	}
	public void show() {
		System.out.println("Student ID: "+stdid);
		System.out.println("Enrolled Course : "+course);
	}
}
class Employee extends details
{
	public void input()
	{
		System.out.println("Enter Department:");
		dept=sc.next();
		System.out.println("Enter Designation:");
		desg=sc.next();
		System.out.println("Enter Salary: ");
		sal=sc.nextDouble();
	}
	public void show()
	{
		System.out.println("Department: "+dept);
		System.out.println("Designation: "+desg);
		System.out.println("Salary: "+sal);
	}
}
public class university {

	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Student");
		System.out.println("2.Employee");
		System.out.println("Enter your Choice: ");
		ch=sc.nextInt();
		details d=new details();//created object for the base class details
		student ed=new student();//created object for the class student
		Employee em=new Employee();//created object for the class employee
		switch (ch) {//asking user to input either anyone of the choice
		case 1: {
			
			d.input();//calling input method of class details
			ed.input();//calling input method of class student
			System.out.println("-------------------");
			System.out.println("--Student Details--");
			d.show();//calling show method of details 
			ed.show();//calling show method of student
			break;
		}
		case 2:{
			
			d.input();//calling input method of details 
			em.input();//calling input method of employee
			System.out.println("---------------------");
			System.out.println("--Employee Details--");
			d.show();//calling show method of details
			em.show();//calling show method of class student
			break;
		}
		default:
		{
			System.out.println("Invalid Choice");
		}
			
		}
		
		}
	}


