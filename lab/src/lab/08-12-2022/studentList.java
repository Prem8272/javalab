package lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class studentList {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		m.put(21,"rahul");
		m.put(22,"raj");
		m.put(23,"rakesh");
		m.put(24,"rakul");
		m.put(25,"ramesh");
		Scanner sc=new Scanner(System.in);//asking user to input the ID
		System.out.println("Search Id: ");
		int n=sc.nextInt();
		System.out.print(m.get(n));
		sc.close();//taking input is closed
	}
}
 