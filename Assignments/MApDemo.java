   package Assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MApDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>vehicles=Arrays.asList("bus","car","bicycle","flight","train");
	
	List<String>uppercaseNames=new ArrayList<String>();
	uppercaseNames=vehicles.stream().map(word->word.toUpperCase()).collect(Collectors.toList());
System.out.println(uppercaseNames);
vehicles.stream().map(len->len.length()).forEach(l->System.out.println(l));
	
	}
	
	
	

}
