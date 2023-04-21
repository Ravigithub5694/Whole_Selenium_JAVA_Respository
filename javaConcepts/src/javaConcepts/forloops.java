package javaConcepts;

public class forloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for loops
		 
		int[] num= {1,4,6,7,8,};
		System.out.println("list of Num arrary are");
		for(int i:num)
		{
			System.out.println(+i);
			
		}
		for(int j=0;j<num.length;j++)
		{
			//to print even numbers in array
			if( num[j]%2==0)
				
			{
				System.out.println(num[j]);
			}
			else 
			{
				System.out.println(num[j]);
			}
		}
			
		}
		
	}


