import java.util.*;

class PositiveNegative{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		
		if(n >= 0){
			System.out.println(n + " is a Positive Number.");
		} else {
			System.out.println(n + " is a Negative Number.");
		}
	}
}