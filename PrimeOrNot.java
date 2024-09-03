import java.util.*;
class PrimeOrNot{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		
		System.out.println();
		
		int flag = 1;
		for(int i=2; i<=Math.sqrt(n); i++){
			if(n % i == 0){
				flag = 0;
				break;
			}
		}
		
		if(flag == 1){
			System.out.println(n + " is a Prime Number.");
		} else {
			System.out.println(n + " is not a Prime Number.");
		}
	}
}