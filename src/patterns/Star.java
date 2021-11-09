package patterns;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter no. of star : ");
//		int n=sc.nextInt();
		int n=5;
		System.out.println("Your 5 star pattern print below ");
		
/*		//Decreasing pyramid
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <n; j++) {
				System.out.print("* ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
*/		
		
		
/*		// Increasing pyramid
	
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
*/	
		
	/*	//Right sided decreasing triangle
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {		// * * * * *
				System.out.print("  ");			//   * * * *
			}									//     * * *
			for (int j = i; j <= n; j++) {		//       * *
				System.out.print("* ");			//		   *
			}
			System.out.println();
		}
	*/	
		
/*		//Right sided increasing triangle
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <n; j++) {				//         *
				System.out.print("  ");					//		 * *
			}											//	   * * *
			for (int j = 1; j <= i; j++) {				//   * * * *
				System.out.print("* ");					// * * * * *
			}
			System.out.println();}
 */		
		
	/*	//increasing triangle
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	*/
		
	/*	//decreasing triangle
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <=n; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	*/	
		
	/*   // Square pattern
		for (int i = 1; i <=n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" * ");
			}
			System.out.println();
			}
*/
	}}
