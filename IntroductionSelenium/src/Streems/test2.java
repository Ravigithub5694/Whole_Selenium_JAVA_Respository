package Streems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//print names ends with "a" and upper case

		Stream.of("ravi","Amma","don","Dad","Abhi","Arua").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		//print names which starts with "a" and sorted
		
		List<String> l=Arrays.asList("Ravi","Amma","don","Dad","Abhi","Arua");
		l.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//merging two arraylists and sorting
		ArrayList<String> a=new ArrayList<String>();
		a.add("Ravi1");
		a.add("Amma1");
		a.add("don1");
		a.add("Dad1");		
		a.add("Abhi1");
		//merging the lists
		Stream.concat(a.stream(), l.stream()).sorted().forEach(s->System.out.println(s));;
		//to know if the merged list conatins ravi
		Stream<String> newstreem=Stream.concat(a.stream(), l.stream());
		//newstreem.sorted().forEach(s->System.out.println(s));
		boolean flag=newstreem.anyMatch(s->s.equalsIgnoreCase("ra12vi"));
		Assert.assertTrue(flag);
		
	}

}