package Collections;

import java.util.HashSet;

public class HetroHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

				HashSet hashset=new HashSet();
				hashset.add("Name");
				hashset.add("Pushpa");
				hashset.add(45);
				hashset.add("Pushpa");
				hashset.add(null);
				hashset.add(35);
				hashset.add(25.8);
				hashset.add('F');
				
				
				for(Object value:hashset)
				{
					System.out.println(value);
				}
				
	}

}
