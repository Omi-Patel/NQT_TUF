import java.util.*;
class StrongNumber{
// When the sum of factorial of individual digits of a number
// is equal to the original number the number is called a strong number. 
// Strong number is also known as Krishnamurthi number/Peterson Number.

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		
		System.out.println("Given number " + n + " is Strong Number ? : " + isStrong(n));
	}
	
	public static boolean isStrong(int n){
		int sum = 0;
		int temp = n;
		
		while(temp > 0){
			int rem = temp % 10;
			
			sum += fact(rem);
			
			temp /= 10;
		}
		
		return (sum == n);
	}
	
	public static int fact(int n){
		if(n == 0 || n == 1){
			return 1;
		}
		
		return n * fact(n-1);
	}
}