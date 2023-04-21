package javaConcepts;

public class forloops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1 2 3 4 5 6 7 8 9 10
		 */
		int k = 1;
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= 4 - i; j++) {

				System.out.print(k);
				System.out.print(" ");
				k++;
			}
			System.out.println();
		}
		int m = 1;
		for (int i = 1; i < 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(m);
				System.out.print(" ");
				m++;
			}
			System.out.println();
		}

		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				System.out.print(" ");
				
			}System.out.println();
		}
		int n=3;
		for(int i=1;i<4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n);
				System.out.print(" ");
				n=n+3;
			}System.out.println();
		}
	}

}
