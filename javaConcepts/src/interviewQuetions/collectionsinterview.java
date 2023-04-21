package interviewQuetions;

import java.util.ArrayList;

public class collectionsinterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find out the number of times a number is repetitive in an array
		int a[]= {2,3,4,5,3,3,4,5,4,5,5,6,6,7};
		//take empty arraylist push the values 
		//print the unique number from the array
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int  i=0;i<a.length;i++) {
			int k=1;
			if(!al.contains(a[i])) {
				al.add(a[i]);
				
				for(int j=i+1;j<a.length;j++) {
					
					if(a[i]==a[j]) {
						k++;
					}
					
				}System.out.println(a[i]);
				System.out.println(k);
				if(k==1) {
					System.out.println("unique number is "+a[i]);
				}
			}
			
		}
		
	}

}
