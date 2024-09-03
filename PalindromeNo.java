import java.util.*;
class PalindromeNo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		
		System.out.println();
		
		int temp = n;
		int sum = 0;
		
		while(temp > 0){
			int rem = temp % 10;
			sum = (sum * 10) + rem;
			temp /= 10;
		}
		
		if(sum == n){
			System.out.println(n + " is a Palindrome Number.");
		} else {
			System.out.println(n + " is not a Palindrome Number.");
		}
	}
}