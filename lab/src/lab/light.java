package lab;

public class light extends Thread {
	public void run()
	
	{
		int a=0;
		while(a<3)
		{
				System.out.println("Red light is ON");
				int t=3;
				try
				{
					System.out.println("Remaining time: ");
					while(t>0)
					{
						System.out.println(t--);
					Thread.sleep(3000);
					}
					
				}
				catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("Red light is OFF");
				System.out.println("-----------------------");
				
				System.out.println("Green light is ON");
				t=5;
				try
				{
					System.out.println("Remaining time: ");
					while(t>0)
					{
						
						System.out.println(t--);
					Thread.sleep(5000);
					}
					
				}
				catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("Green light is OFF");
				System.out.println("-----------------------");
				
				
				System.out.println("Yellow light is ON");
				t=2;
				try
				{
					System.out.println("Remaning time: ");
					while(t>0)
					{
						
					System.out.println(t--);
					Thread.sleep(3000);
					}
					
				}
				catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("Yellow light is OFF");
				System.out.println("-----------------------");
		}
		a++;
	}
	public static void main(String[] args) {
		light l=new light();
		
			l.start();
	}
	}
