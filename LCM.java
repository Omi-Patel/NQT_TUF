import java.util.*;
class LCM{
	
	public static int gcd(int a, int b){
		if(b == 0) return a;
		
		return gcd(b, a%b);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any two number to find LCM : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("LCM of " + a + " and " + b + " is : " + (a * b ) / gcd(a, b));
	}
}