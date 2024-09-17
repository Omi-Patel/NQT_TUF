import java.util.*;
class GCD{
	
	public static int gcd(int a, int b){
		if(b == 0) return a;
		
		return gcd(b, a%b);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any two number to find GCD : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("GCD of " + a + " and " + b + " is : " + gcd(a, b));
	}
}