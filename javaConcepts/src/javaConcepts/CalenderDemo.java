package javaConcepts;

import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calnder
		Calendar c= Calendar.getInstance();
		
		//System.out.println(sdf.format(d));
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.AM_PM));
	}

}
