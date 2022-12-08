package lab;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class contactbook {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		Set<String> name=new HashSet<>();
		Set<Long> phno=new HashSet<>();
		Set<String>email=new HashSet<>();
		int n = 0;
		//Asking user to input the number of contacts to be saved 
		System.out.println("Enter No.of contact to be added: ");
		n=sc.nextInt();
		//for loop is used to take correct input and to save the contacts
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter the name: ");
		name.add(sc.next());
		System.out.println("Enter the Phone Number: ");
		phno.add(sc.nextLong());
		System.out.println("Enter the Email: ");
		email.add(sc.next());
		}
		System.out.println("----Conatact Book----");
		System.out.println("Name: \t"+name+ "\nMobile:\t"+phno+ "\nEmail: \t"+email);
		
	}

}
