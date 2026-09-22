package Assignments;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>map=new HashMap<>();
		map.put("pushpa",90);
		map.put("murali", 70);
		map.put("yeshwanth", 98);
		map.put("sai",81);
		System.out.println(map.get("pushpa"));
	/*	for(Integer k:map.values())
		{
			if(k>80)
			{
				System.out.println(k);
			}
		}*/
		/*for (Map.Entry<String, Integer> entry : map.entrySet()) {
		    if (entry.getValue() > 80) {
		        System.out.println(entry.getKey() + " -> " + entry.getValue());
		    }
		}*/
		for(Map.Entry<String,Integer> entry:map.entrySet())
		{
			if(entry.getValue()>80)
			{
				System.out.println(entry.getKey()+"-->"+entry.getValue());
			}
		}
		
		
	
		

	}

}
