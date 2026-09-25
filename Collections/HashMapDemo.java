package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String ,String>hm=new HashMap<String,String>();
hm.put("1","pushpa");
hm.put("2", "Tanvi");
hm.put("3", null);
hm.put(null, "Shruthi");
hm.put(null, null);
hm.put("A1", "Shruthi");
hm.put("3","prabha");
for(Entry<String,String> hm1:hm.entrySet())
{
System.out.println(hm1.getKey()+"-->"+hm1.getValue());
	}

}
}
