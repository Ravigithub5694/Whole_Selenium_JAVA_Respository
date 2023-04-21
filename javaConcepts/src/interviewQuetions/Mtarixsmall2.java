package interviewQuetions;

public class Mtarixsmall2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Print the smallest number of the matrix
		 * 2 4 5
		 * 3 4 7
		 * 1 2 9
		 * 
		 */
		int abc[][]= {{2,4,5},{3,6,7},{1,2,0}};
		int min=abc[0][0];
		for(int i=0;i<abc.length;i++) {
			
			for (int j=0;j<abc.length;j++) {
				
				if(abc[i][j]<abc[0][0]) {
					min= abc[i][j];
				}
			}
		} System.out.println("Minimum number is "+min);
		
	}

}
