import java.util.*;
class Automorphic{
	
	// A number is called an Automorphic number if and only if 
	// its square ends in the same digits as the number itself.
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		int temp = n;
		
		int sq = n * n;
		System.out.println("Square : " + sq);
		
		int flag = 1;
		
		while(n > 0){
			int rem1 = n % 10;
			int rem2 = sq % 10;
			
			if(rem1 != rem2){
				System.out.println("Given number " + temp + " is Not Automorphic Number.");
				flag = 0;
				break;
			}
			
			n /= 10;
			sq /= 10;
		}
		
		if(flag == 1){
			System.out.println("Given number " + temp + " is a Automorphic Number.");
		}
	}
}