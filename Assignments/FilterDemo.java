package Assignments;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>words=Arrays.asList("abc","lmn",null,"pqr",null);
		
		List<String>result=words.stream().filter(str->str!=null).collect(Collectors.toList());
		System.out.println(result); 

	}

}
