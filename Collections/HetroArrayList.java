package Collections;

import java.util.ArrayList;

public class HetroArrayList {

	public static void main(String[] args) {
		// T// TODO Auto-generated method stub
		ArrayList ArrayList=new ArrayList();
		ArrayList.add("Pushpa");
		ArrayList.add(35);
		ArrayList.add(5.3);
		ArrayList.add("CA");
		ArrayList.add(null);

		for(int i=0;i<ArrayList.size();i++)
		{
			System.out.println(ArrayList.get(i));
		}

	}

}//arraylist takes hetrogenius values into it.
