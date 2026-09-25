package Collections;

import java.util.ArrayList;

public class ArrayListHomo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ArrayList=new ArrayList<String>();
		ArrayList.add("Sruthi");
		ArrayList.add("Prabha");
		ArrayList.add("Minal");
		ArrayList.add("MahaLakshmi");
		ArrayList.add("Minakshi");
		ArrayList.add("Pushpa");
		ArrayList.add("Shilpa A");
		ArrayList.add("Shilpa Y");
		ArrayList.add(null);
		ArrayList.add("pushpa");
		for(int i=0;i<ArrayList.size();i++)
		{
			System.out.println(ArrayList.get(i));
		}
		/*ArrayList is class implements list interface
		 * It maintains Insertion order
		 * It stores null value
		 * It stores duplicate values
		 * We can access the value from Arraylist by its index
		 * Arraylist can hold hetrogenous data too
		 */

	}

}
