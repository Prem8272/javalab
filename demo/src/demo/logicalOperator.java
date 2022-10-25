package demo;

import java.util.Scanner;

public class logicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value;
		Scanner sc=new Scanner(System.in);
		System.out.println("Wnter the value: ");
		value=sc.nextInt();
		if((value>=10)&&(value%2==0))
		{
			System.out.println("value>10 and even");
		}
		else
		{
			System.out.println("conditions not met");
		}

	}

}
