import java.util.*;
class GreatestOfTwo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any two space seperated number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Greatest Number is : " + Math.max(a, b));
	}
}