package Streems;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// count the number of names starts with alphabet a without java streems

		ArrayList<String> a = new ArrayList<String>();
		a.add("ravi");
		a.add("Amma");
		a.add("don");
		a.add("Dad");
		a.add("Abhi");
		/*
		 * int k=0; for(int i=0;i<a.size();i++) { if(a.get(i).startsWith("A")) { k++; }
		 * 
		 * }System.out.println(k);
		 */

		// using streem
		// use lambda expressions
		// convert to streem > perform intermediate operation> then perform terminal
		// operation
		// there is no life for intermediate operation
		// terminal operation will executes only if filter returns true

		Long c = a.stream().filter(s -> s.startsWith("A")).count();

		System.out.println(a.stream().filter(s -> s.startsWith("D")).count());

		System.out.println(c);
		// we can create lightweight stream without creating any collection object

		Long d = Stream.of("ravi", "Amma", "don", "Dad", "Abhi", "Aru'").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);

		// to print the names in the arralyslist whose length is >3
		a.stream().filter(s -> s.length() > 3).forEach(s -> System.out.println(s));
		a.stream().filter(s -> s.length() > 3).limit(1).forEach(s -> System.out.println(s));
		a.stream().filter(b -> b.length() > 4).limit(1).forEach(b -> System.out.println(b));
	}

}
