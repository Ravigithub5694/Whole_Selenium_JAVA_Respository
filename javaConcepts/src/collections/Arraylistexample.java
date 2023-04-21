package collections;

import java.util.ArrayList;

public class Arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a=new ArrayList<Integer>();//dynamic size
		ArrayList<String> b=new ArrayList<String>();
		a.add(1);
		a.add(2);
		b.add("ravi");
		b.add("selenium");
		System.out.println(a.get(1));
		System.out.println(b.contains("ravi"));
		System.out.println(b.indexOf("ravi"));
		a.size();
		a.isEmpty();

	}

}
