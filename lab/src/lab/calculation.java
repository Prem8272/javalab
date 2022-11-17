package lab;

import java.util.Scanner;

public class calculation {

	public static void main(String[] args) {
		int n1,n2,n3,ch;
		Scanner sc=new Scanner(System.in);//scanner is to take input from the user
		System.out.println("Enter 2 numbers: ");
		n1=sc.nextInt();//first input value is stored in n1
		n2=sc.nextInt();//second input value is stored in n2
		if(n1==0 || n2==0)//it checks any one of the input is zero
		{
			//is throws to exception zero is not accepted
			throw new ArithmeticException("Process stopped- zero cannot be accepted");
		}
		
		System.out.println("Enter the opertaor(+,-,*,/):");
		char op=sc.next().charAt(0);
		
		//using switch case to perform mathematical any one at a time
		switch(op)
		{
		case '+': n3=n1+n2;
		System.out.println("Addition of "+n1+" and "+n2+" is: "+n3);
		break;
		
		case '-':n3=n1-n2;
		System.out.println("Subtraction of "+n1+" and "+n2+" is: "+n3);
		break;
		
		case '*':n3=n1*n2;
		System.out.println("Multiplication of "+n1+" and "+n2+" is: "+n3);
		break;
		
		case'/':n3=n1/n2;
		System.out.println("Division of "+n1+" and "+n2+" is: "+n3);
		break;
		
		default:System.out.println("Invalid operator");
		break;
		}
		
		

	}

}
