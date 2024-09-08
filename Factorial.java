import java.util.*;
class Factorial{
	
	public static int factorial(int n){
		if(n == 0 || n == 1){
			return 1;
		} 
		
		return n * factorial(n - 1);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any Number : ");
		int n = sc.nextInt();
		
		// Iterative
		int fib = 1;
		for(int i=1; i<=n; i++){
			fib *= i;
		}
		
		System.out.println("Factorial of " + n + " is :" + fib);
		
		// Recursive
		int fact = factorial(n);
		System.out.println("Recursive Factorial of " + n + " is :" + fib);
	}
}