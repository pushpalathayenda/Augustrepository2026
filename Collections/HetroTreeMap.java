package Collections;

import java.util.Map.Entry;
import java.util.TreeMap;

public class HetroTreeMap {

	public static void main(String[] args) {
		// TODO Auto-geObjectd method stub
TreeMap<Object,Object>tm1=new TreeMap<Object,Object>();
tm1.put(1, "pushpa");
tm1.put(2, "Lucky");
tm1.put(5, "height");
tm1.put(5, 35);

//for(Entry <Object,Object> entry:tm1.entrySet())
for(Entry key:tm1.entrySet())
{
	System.out.println(key.getKey()+" ->"+key.getValue());
}
//treemap wont accept hetrogenous key values.
	}

}