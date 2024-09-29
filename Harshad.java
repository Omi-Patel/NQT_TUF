// Harshad number is a number which is divisible by sum of it's digits...

import java.util.*;
class Harshad{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		
		int temp = n;
		int sum = 0;
		while(temp > 0){
			int rem = temp % 10;
			sum += rem;
			temp /= 10;
		}
		
		if(n % sum == 0){
			System.out.println("YES " + n + " is Harshad Number.");
		} else{
			System.out.println("NO " + n + " is not Harshad Number.");
		}
	}
}