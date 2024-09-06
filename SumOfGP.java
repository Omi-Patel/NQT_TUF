import java.util.*;
class SumOfGP{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of terms in GP : ");
		int n = sc.nextInt();
		
		System.out.println();
		
		System.out.print("First term of GP : ");
		int a = sc.nextInt();
		
		System.out.println();
		
		System.out.print("Common ratio of GP : ");
		int r = sc.nextInt();
		
		// Formule for finding sum of first n term of GP
		// a (r ^ n - 1) / (r - 1)
		
		float sum = a * ((float) Math.pow(r, n) - 1) / (r -1);
		
		System.out.println("Sum of GP : " + sum);
	}
}