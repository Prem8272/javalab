package lab;

import java.util.Scanner;

public class stdrecord {
	    public static void main(String args[]) {
	        final int TOTAL_STUDENTS = 1;
	        Scanner in = new Scanner(System.in);//input from the user 
	        
	        String name = null,rollno=null,result="";
	        int s1[] = new int[TOTAL_STUDENTS];
	        int s2[] = new int[TOTAL_STUDENTS];
	        int s3[] = new int[TOTAL_STUDENTS];
	        int s4[] = new int[TOTAL_STUDENTS];
	        int s5[] = new int[TOTAL_STUDENTS];
	        int s6[] = new int[TOTAL_STUDENTS];
	        int tot=0;
	        char g = 0;
	        float avg = 0;
	        
	        for (int i = 0; i < TOTAL_STUDENTS; i++) {
	            
	            System.out.println("Enter student details:");
	            System.out.print("Roll No: ");
	            rollno = in.next();
	            in.nextLine();
	            System.out.print("Name: ");
	            name = in.next();
	            System.out.print("Subject 1 Marks: ");
	            s1[i] = in.nextInt();//input stored in the array name s1
	            System.out.print("Subject 2 Marks: ");
	            s2[i] = in.nextInt();//input stored in the array name s2
	            System.out.print("Subject 3 Marks: ");
	            s3[i] = in.nextInt();//input stored in the array name s3
	            System.out.print("Subject 4 Marks: ");
	            s4[i] = in.nextInt();//input stored in the array name s4
	            System.out.print("Subject 5 Marks: ");
	            s5[i] = in.nextInt();// input stored in the array name s5
	            System.out.print("Subject 6 Marks: ");
	            s6[i] = in.nextInt();//input stored in the array name s6
	            //calculating the total
	            tot = ((s1[i] + s2[i] + s3[i] + s4[i] + s5[i] + s6[i]));
	            avg=(tot/ 600.00f) * 100;
	            //conditional statements to check the Rank 
	            if(s1[i]<35 || s2[i]<35 || s3[i]<35 || s4[i]<35 || s5[i]<35 || s6[i]<35)//if anyone subject is below 35 is consider as "Fail"
	            {
	            	result = "Fail";
	            }
	            else {
	            	result="Pass";
	            }
	            	
	            	if(tot < 40)
	                g = 'D';
	            else if (tot < 60)
	                g = 'C';
	            else if (tot < 80)
	                g = 'B';
	            else
	                g = 'A';
	        }
	        System.out.println();
	        System.out.println("---Student Result----");
	        
	        for (int i = 0; i < TOTAL_STUDENTS; i++) {
	            System.out.println("Rollno: "+ rollno + "\nStudent Name: " + name + "\nTotal:  " + tot + "\nAverage: "+avg+"\nGrade: "  +g+"\nResult: " +result);
	        }
	    }
	}