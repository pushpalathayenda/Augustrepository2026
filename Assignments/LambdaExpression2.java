package Assignments;
@FunctionalInterface
interface Cab1
{
	public String bookcab(String source,String Destination);
	
}

public class LambdaExpression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cab1 c=(source,Destination)->{System.out.println("ola cab os booked from "+source+"to"+Destination);
	return ("price is 5000");
};
	System.out.println(c.bookcab("hyd","mumbai"));
	}
	

}
