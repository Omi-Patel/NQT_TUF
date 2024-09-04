import java.util.*;

class ArmstrongNo{
	
	public static int findDigit(int n){
		int count = 0;
		
		while(n > 0){
			count++;
			
			n /= 10;
		}
		
		return count;
	}
	
	public static void main(String args[]){
		// An Amrstrong number is a number that is 
		//equal to the sum of its own digits each raised to the power of the number of digits.

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		
		int digit = findDigit(n);
		
		int temp = n;
		int sum = 0;
		while(temp > 0){
			int rem = temp % 10;
			
			sum = sum + (int)Math.pow(rem, digit);
			
			temp /= 10;
		}
		
		if(sum == n){
			System.out.println(n + " is Armstrong Number.");
		} else {
			System.out.println(n + " is not Armstrong Number.");
		}
	}
}