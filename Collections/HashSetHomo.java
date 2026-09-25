package Collections;

import java.util.HashSet;

public class HashSetHomo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String>hashset=new HashSet<String>();
		hashset.add("Pushpa");
		hashset.add("Pushpa");
		hashset.add(null);
		hashset.add("Yenda");
		hashset.add("Shilpa");
		hashset.add("Murali");
		
		for(String value:hashset)
		{
			System.out.println(value);
		}
		
	}

}
