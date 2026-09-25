package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HetroHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Object, Object> hetromap = new HashMap<>();
           hetromap.put(5.1f, "Pushpa");
           hetromap.put(5.6,"Lucky");
           hetromap.put(5,"Dhakshu");
           hetromap.put(5.4, "Leela");
           hetromap.put(null,"Yenda");
           hetromap.put("Likki", 4.5);
     for (Entry<Object, Object> entry : hetromap.entrySet()) {
               System.out.println(entry.getKey()+"-->"+entry.getValue());
           }
	}

}
