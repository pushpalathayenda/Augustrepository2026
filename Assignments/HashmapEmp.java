package Assignments;

import java.util.HashMap;
import java.util.Map;

public class HashmapEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> h=new HashMap<>();
		h.put("pushpa", 25000);
		h.put("murali", 35000);
		
		h.put("Lucky", null);
		h.put("yeshwanth", 40000);
		h.put("Lucky", 40000);
		
		
		for(Map.Entry<String,Integer>E:h.entrySet())
		{
		
		
			System.out.println(E.getKey()+"-->"+E.getValue());
		}
	

	}

}
