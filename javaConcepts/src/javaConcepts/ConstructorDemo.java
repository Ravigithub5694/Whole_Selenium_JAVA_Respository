package javaConcepts;

public class ConstructorDemo {

	public ConstructorDemo() {
		System.out.println("I'm default constructor");
	}
	//parametrized constructor
	
	public ConstructorDemo(int a) {
		System.out.println("I'm parameterized a constructor");
	}
	public ConstructorDemo(String a) {
		System.out.println("I'm parameterized string a constructor");
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo cd1=new ConstructorDemo(4);
		ConstructorDemo cd2=new ConstructorDemo("Ravi");
			
		}
		//Constructor executes a block of code when ever object is created 
		//will not return any values
		// name of the constructor should be same as class name
		//compiler will call implicit(default) constructor if there is no constructor defined
		
		//to initiate variables we use in real life or set environment 
		
		
	}


