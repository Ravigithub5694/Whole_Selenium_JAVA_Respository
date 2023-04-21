package interviewQuetions;

public class Mtarixsmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Print the smallest number of the matrix and find the greatest number in the same column
		 * 2 4 5
		 * 3 6 7
		 * 1 2 9
		 * , identify the minium number, note the column number & find the 
		 */
		int abc[][]= {{2,4,5},{3,6,7},{1,2,0}};
		int min=abc[0][0];
		int mincol=0;
		for(int i=0;i<abc.length;i++) {
			
			for (int j=0;j<abc.length;j++) {
				
				if(abc[i][j]<abc[0][0]) {
					min= abc[i][j];
					mincol=j;
				}
			}
		} System.out.println("Minimum number is "+min);
		int max=abc[0][mincol];
		int k=0;
		while(k<3) {
			
			if(abc[k][mincol]>max) {
				max=abc[k][mincol];
				
			}k++;
		}
		System.out.println("Graetest number is "+max+" found at column "+mincol);
		
	}

}
