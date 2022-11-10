package lab;

import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);//scanner is to take input from the user
		int x1,x2,y1,y2;
		int a[][]=new int[10][10];//declaring and initilizing the array
		int b[][]=new int[10][10];
		int c[][]=new int[10][10];
		System.out.println("Enter 1st matrix row and column: ");
		//asking the user to input the size of the 1st matrix array
		x1=s.nextInt();//storing the size of array of row
		y1=s.nextInt();//storing the size of array of column
		System.out.println("Enter 2nd matrix row and columx: ");
		x2=s.nextInt();//storing the size of array of row
		y2=s.nextInt();//storing the size of array of column
		System.out.println("Enter the 1st matrix elements: ");
		for(int i=0;i<x1;i++)
		{
			for(int j=0;j<y1;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter the 2nd matrix elements: ");
		for(int i=0;i<x2;i++)
		{
			for(int j=0;j<y2;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		//Multiplication operation starts from here
		for(int i=0;i<x1;i++)
		{
			for(int j=0;j<y2;j++)
			{
				c[i][j]=0;
				for(int k=0;k<x2;k++) 
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		//To print the processed matrix
		System.out.println("Multiplication of Matrix");
		for(int i=0;i<x1;i++)
		{
			for(int j=0;j<y2;j++)
			{
				System.out.print(c[i][j]+"\t");//prints in matrix formate
				
			}
			System.out.println();
		}
		

	}

}
