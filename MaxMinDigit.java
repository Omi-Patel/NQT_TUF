import java.util.*;
class MaxMinDigit{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any Number : ");
		int n = sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while(n > 0){
			int rem = n % 10;
			max = Math.max(max, rem);
			min = Math.min(min, rem);
			
			n /= 10;
		}
		
		System.out.println("Max no : " + max + " & Min no : " + min);
	}
}