import java.util.*;
class EvenOdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		
		if(n % 2 == 0){
			System.out.println(n + " is a Even Number." );
		} else {
			System.out.println(n + " is a Odd Number.");
		}
	}
}