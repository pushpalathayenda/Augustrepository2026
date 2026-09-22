//package Day3Assignments;
package Assignments.Day3;

public class NonStaticMethods {
	
	public double nonStaticMethod1()
	{
		String s1="pushpa";
		int id=1;
	System.out.println("ID:"+id+"\n"+"Name:"+s1);
		double salary=25000;
		return salary;
	}
public double nonStaticMethod2()
{ double sal=nonStaticMethod1();
	
	return (sal*12)+0.10*sal;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMethods ns=new NonStaticMethods();
		System.out.println("Employee details::");
	System.out.println("Anual pay for employee :"+ns.nonStaticMethod2());
	}

}
