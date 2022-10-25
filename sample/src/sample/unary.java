package sample;

public class unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int first=10, second;
second=++first;
System.out.println("first:" +first+ ",second:" +second);

second=first++;
System.out.println("first:" +first+ ",second:" +second);
	
second=--first;
System.out.println("first:" +first+ ",second:" +second);
	
second=first--;
System.out.println("first:" +first+ ",second:" +second);
	}
}