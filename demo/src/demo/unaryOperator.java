package demo;

public class unaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=10, second;
		second=++first;
		System.out.println("First: " +first+",Second: "+second);
		
		second=first++;
		System.out.println("First: " +first+",Second: "+second);
		
		second=--first;
		System.out.println("First: " +first+",Second: "+second);
		
		second=first--;
		System.out.println("First: " +first+",Second: "+second);

	}

}
