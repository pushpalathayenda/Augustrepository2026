package Collections;

import java.util.TreeSet;

public class TreeSetHomo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String>treeset=new TreeSet<String>();
treeset.add("Pushpa");
treeset.add("latha");
treeset.add("Yenda");
treeset.add("Shilpa");
treeset.add("Akshay");
treeset.add("sruthi");
TreeSet<Integer>Numtree=new TreeSet<Integer>();
Numtree.add(90);
Numtree.add(67);
Numtree.add(23);
for(String value:treeset)
{
	System.out.println(value);
}
for(Integer value:Numtree)
{
	System.out.println(value);
}
	}
	/*TreeSet is class implementssorted set which extends Set interface of collection framwork
	 * treeset doesnot maintain insertion order
	 
	 * treeset  doesnot takes null values
	 * TreeSet doesnot takehetrogeneous dataor objects.
	 * jvm  throws classcase exception.
	 * Treeset compares and sortes same type of objects or data.
	 * TreeSet sorting upcase letter has more priority then lowercase.
	 */

}
