import java.util.*;
class GreatestOfThree{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any three space seperated number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("Greatest Number is : " + Math.max(a, Math.max(b, c)));
	}
}