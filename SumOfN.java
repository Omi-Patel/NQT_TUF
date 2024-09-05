import java.util.*;
class SumOfN{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		
		int sum = (n * (n+1)) / 2;
		
		System.out.println("Sum of First " + n + " number is : " + sum);
	}
}