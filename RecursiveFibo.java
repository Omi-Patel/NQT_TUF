import java.util.*;
class RecursiveFibo{
	
	public static int fib(int n){
		if(n == 0 || n == 1){
			return n;
		}
		
		return fib(n-1) + fib(n-2);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the term of fibonnaci series : ");
		int n = sc.nextInt();
		
		System.out.println(n + "th Term of Fibonacci is : " + fib(n));
		
		sc.close();
	}
}