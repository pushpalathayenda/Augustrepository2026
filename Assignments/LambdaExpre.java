package Assignments;
@FunctionalInterface
interface Cab
{
	public void bookCab();
	}

//class Ola implements Cab

	/*public void bookCab()
	{
		System.out.println("ola cab is booked");
		}
	*/
	//lambda expresstion for above method
	//()->System.out.println("ola cab is booked");


public class LambdaExpre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cab c=()->System.out.println("ola cab is booked");//lambda expression
		c.bookCab();

	}

}
