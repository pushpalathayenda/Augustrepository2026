package Assignments;

/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;*/
import java.util.*;
import java.util.stream.Collectors;


public class StreamsFilter {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("pushpa","muralidhar","Yeshwanth");
		
List<String>longnames=new ArrayList<String>();
/*longnames=names.stream().filter(str->str.length()>6&&str.length()<10).collect(Collectors.toList());
	System.out.println(longnames);*/
//names.stream().filter(str->str.length()>6&&str.length()<10).forEach(str->System.out.println(str));
names.stream().filter(str->str.length()>6&&str.length()<10).forEach(System.out::println);
	}
	

}
