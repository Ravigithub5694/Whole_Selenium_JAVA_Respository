package Streems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//stream collect method convert the result to list
		List<String> l=Stream.of("ravi","Amma","don","Dad","Abhi","Arua").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(l.get(0));
	//print the unique number form the list
	//sort them and pring the 3rd index
		List<Integer> list=Arrays.asList(4,5,5,6,1,2,2,4,7,9,7);
		List newvalue=list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(newvalue.get(3));
		
		
	}

}
