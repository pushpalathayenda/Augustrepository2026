package Collections;

import java.util.Map.Entry;
import java.util.TreeMap;

public class CircusProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,Integer>t1=new TreeMap<Integer,Integer>();

t1.put(70, 150);
t1.put(56, 90);
t1.put(75, 190);
t1.put(60, 95);
t1.put(68, 110);
for(Entry<Integer,Integer>k:t1.entrySet())
{
	System.out.println(k.getKey()+"-->"+k.getValue());
}
	}

}
