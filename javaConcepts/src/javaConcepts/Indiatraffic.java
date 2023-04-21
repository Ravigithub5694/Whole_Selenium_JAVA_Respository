package javaConcepts;

public class Indiatraffic implements Centraltraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Centraltraffic i=new Indiatraffic();
		i.gogreen();
		i.redstop();
		i.yellowstart();
		Indiatraffic in=new Indiatraffic();
	
		in.zebracross();
		in.gogreen();
		
	}

	public void zebracross() {
		System.out.println("zebracross implementation");
	}
	@Override
	public void gogreen() {
		// TODO Auto-generated method stub
		System.out.println("Go Green implementation");
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("redstop implementation");
		
	}

	@Override
	public void yellowstart() {
		// TODO Auto-generated method stub
		System.out.println("yellowstart implementation");
	}

}
