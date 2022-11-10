package lab;

public class carmodel {
	
	

	public static void main(String[] args) {
		enum car{BMW(2021),Benz(2019),Audi(2017);//creating an enum for constant values
			private int i ;

			private car(int i) {
				this.i = i;
			}
		}
		System.out.println("Car  \t Model");
		for(car c: car.values())//printing all the values of enum
		{
			System.out.println(c+"-\t"+c.i);
		}
	}

	}
