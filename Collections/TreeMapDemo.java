package Collections;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String>treemap=new TreeMap<Integer,String>();

treemap.put(1,"pushpa");
treemap.put(3, "Tanvi");
treemap.put(2, "Shruthi");
treemap.put(5, "Shilpa");
treemap.put(0,"Shilpa");
treemap.put(6, "prabha");
for(Entry<Integer,String> entry:treemap.entrySet())
{
	System.out.println(entry.getKey()+"-->"+entry.getValue());
	
}


	}

	

}
