package sample;

import java.util.Scanner;

public class logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int value;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value:");
value=sc.nextInt();
if((value>=10)&&(value%2==0))
{
	System.out.println("value>10 and even");
}
else
{
	System.out.println("condiotions not met");
}
	}

}
