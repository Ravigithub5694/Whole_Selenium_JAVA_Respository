package javaConcepts;

//Multiple methods in a class has same name = function overloading
//the argument count should be different
//example: E cart payment by different cards, debit credit net banking etc
public class functionoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		functionoverloading f=new functionoverloading();
		f.getdata(3);
		f.getdata("ravi");
		f.getdata(2, 10);
		
	}

	public void getdata(int a) {
		System.out.println(a
				);
	}
	public void getdata(int a, int b) {
		System.out.println(b);
	}
	public void getdata(String a) {
		System.out.println(a);
	
}}

