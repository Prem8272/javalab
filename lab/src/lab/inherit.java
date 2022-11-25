package lab;
class parent//base class
{
	public void print()
	{
		System.out.println("This is parent class");
	}
}
class child extends parent//child class
{
	public void print()
	{
		System.out.println("This is child class");
	}
}

public class inherit {

	public static void main(String[] args) {
		parent p=new parent();//created object for the parent class
		child c=new child();//created object for the child class
		parent pc=new child();//created instance for the base class
		p.print();
		c.print();
		pc.print();

	}

}
