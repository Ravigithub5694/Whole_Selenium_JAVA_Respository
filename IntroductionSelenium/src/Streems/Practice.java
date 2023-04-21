package Streems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("ravi1");
		a1.add("Amma1");
		a1.add("don1");
		a1.add("Dad1");		
		a1.add("Abhi1");
		
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("ravi");
		a.add("Amma");
		a.add("don");
		a.add("Dad");		
		a.add("Abhi");
		a.add("Hemaansh");
		
		System.out.println(a.stream().filter(s->s.startsWith("A")).count());
		
		System.out.println(Stream.of("ravi","Amma","don","Dad","Abhi","Hemaansh").filter(s->
		{
			s.startsWith("A");
		return false;
		}).count());
		
		a.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
		a.stream().filter(s->s.length()>3).limit(1).forEach(s->System.out.println(s));
		//convert strings ends with i in upper case
		Stream.of("ravi","Amma","don","Dad","Abhi","Hemaansh").filter(s->
		s.endsWith("i")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//convert strings ends with i in upper case & sort
		a.stream().filter(s->s.endsWith("i")).sorted().map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		//sorting the list
		a.stream().sorted().forEach(s->System.out.println(s));
		
		//combine 2 streams
		Stream<String> b=Stream.concat(a.stream(), a1.stream());
		b.sorted().forEach(s->System.out.println(s));
		
		// to print if Hemaansh is present or not
		System.out.println(a.stream().anyMatch(s->s.equalsIgnoreCase("Hemaansh")));
		
		//after sorting convert into new list
		
		List<String> newl=a.stream().filter(s->s.endsWith("i")).collect(Collectors.toList());
		
		System.out.println(newl.get(0));
		
		List<Integer> number=Arrays.asList(2,3,2,4,3,4,5,6,1,8);
		//unique values
		number.stream().distinct().forEach(s->System.out.println(s));
		//print sorted unique values
		number.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		
	}

	
	
}
