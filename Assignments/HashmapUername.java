package Assignments;

import java.util.HashMap;
import java.util.Map;

public class HashmapUername {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String>map=new HashMap<>();
		map.put("pushpalatha", "123@34");
		map.put("Lucky", "130881&");
		for(Map.Entry<String,String> entry:map.entrySet())
		{
			if(entry.getValue().length()>6)
			{
				System.out.println(entry.getKey()+"-->"+entry.getValue());
			}
		}
		
		
	}

}
