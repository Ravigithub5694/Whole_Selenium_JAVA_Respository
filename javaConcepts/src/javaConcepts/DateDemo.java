package javaConcepts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("M/dd/yyyy");
		SimpleDateFormat sdf1= new SimpleDateFormat("M/dd/yyyy hh;mm;ss");
		System.out.println(d.toString());
		System.out.println(sdf.format(d));
		System.out.println(sdf1.format(d));
		

	}

}
