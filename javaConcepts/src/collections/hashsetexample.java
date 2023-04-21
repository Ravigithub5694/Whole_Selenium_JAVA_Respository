package collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//set doesn't accept duplicate values
		//hashset. treeset & LinkedHashset implements set interface
		//no guarantee of elements stored in sequencial order
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("ravi");
		hs.add("ravi");
		hs.add("uk");
		hs.add("India");
		hs.add("USA");
		
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(hs);
		System.out.println(hs.remove("uk"));
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println();
		
		
	}

}
