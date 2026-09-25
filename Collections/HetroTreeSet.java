package Collections;

import java.util.TreeSet;

public class HetroTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated emethod stub
		TreeSet treeset=new TreeSet();
		treeset.add("pushpa");
		treeset.add(35);
		treeset.add(95.8);
	
		for(Object value:treeset)
		{
			System.out.println(value);
		}

	}
	/*TreeSet doesnot takehetrogeneous dataor objects.
	 * jvm  throws classcase exception.
	 * Treeset compares and sortes same type of objects or data.
	 */

}
