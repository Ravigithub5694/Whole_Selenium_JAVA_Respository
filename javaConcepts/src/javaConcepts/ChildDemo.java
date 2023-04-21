package javaConcepts;

public class ChildDemo extends ParentDemo{

	String name="Selenium";
	public void getstringdata() {
		System.out.println(super.name);
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildDemo cd=new ChildDemo();
		ParentDemo cd1=new ChildDemo();
		cd.getstringdata();
		
	}

}
