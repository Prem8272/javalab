package lab;

import java.util.Scanner;

public class stringop {
		public static void main(String[] args) {
		String str1,str2,str3;//declare datatypes and initilising variables
		int n,ch;
		Scanner sc=new Scanner(System.in);//scanner is to take input from the user
		System.out.println("---String operations---");
		System.out.println("1.Concatenate of 2 strings");
		System.out.println("2.Length of the String");
		System.out.println("3.Compare 2 Strings");
		System.out.println("4.converting uppercase to lowercase");
		System.out.println("5.converting lowercase to uppercase");
		System.out.print("Enter your choice:\n");//asking user which operation to be performed in above listed
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:System.out.println("Enter 2 strings: ");
		str1=sc.next();
		str2=sc.next();
		str3=str1.concat(str2);
		System.out.println("Concatenation of 2 strings are:"+str3);
		break;
		
		case 2: System.out.println("Enter the string: ");
		str1=sc.next();
		n=str1.length();
		System.out.println("length of the is :"+n);
		break;
		
		case 3: System.out.println("Enter 2 strings: ");
		str1=sc.next();
		str2=sc.next();
		n=str1.compareTo(str2);
		System.out.println("compared to strings are:"+n);
		break;
		
		case 4: System.out.println("Enter the string in uppercase:");
		str1=sc.next();
		str3=str1.toLowerCase();
		System.out.println("converted string is: "+str3);
		break;
		
		case 5: System.out.println("Enter the string in lowercase:");
		str1=sc.next();
		str3=str1.toUpperCase();
		System.out.println("converted string is: "+str3);
		break;
		
		default:System.out.println("Invalid choice");
		
		
		}
		}

}
