
public class STartsPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Print numbers 
		int k=1;
		for (int i=0;i<4; i++) {
			
			
			for(int j=0;j<4-i;j++) {
				System.out.print(k);
				System.out.print(" ");
				k++;
			}System.out.println();
		}
	
	//print the above in reverse
	//1
	//2 3
	//4 5 6
	//7 8 9 10
	for (int i=0;i<4; i++) {
		
		
		for(int j=0;j<=i;j++) {
			System.out.print(k);
			System.out.print(" ");
			k++;
			
			
		}System.out.println();
	}
for (int i=0;i<4; i++) {
		
		
		for(int j=0;j<=i;j++) {
			System.out.print(j);
			System.out.print(" ");
			
			
			
		}System.out.println();
	}
int l=3;
for (int i=0;i<4; i++) {
	
	
	for(int j=0;j<=i;j++) {
		System.out.print(l);
		System.out.print(" ");
		l=l+3;
		
		
	}System.out.println();
}
}

}
