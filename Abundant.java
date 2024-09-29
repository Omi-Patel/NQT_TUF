// Abundant number is a number which has following condition
// sum of the factor of the number is greater than original number.

import java.util.*;
class Abundant{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n/2; i++){
			if(n % i == 0){
				sum += i;
			}
		}
		
		if(sum >= n){
			System.out.println("YES " + n + " is Abundant Number.");
		} else {
			System.out.println("NO " + n + " is not Harshad Number.");
		}
	}
}