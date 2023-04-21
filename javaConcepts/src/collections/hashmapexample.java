package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Ravi");
		hm.put(34, "java");
		hm.put(2, "usa");
		System.out.println(hm.get(34));
		System.out.println(hm.get(0));
		System.out.println();
	
		Set s=hm.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {
			Map.Entry mp=(Map.Entry)it.next();
				
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}

}
