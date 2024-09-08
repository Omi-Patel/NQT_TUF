import java.util.*;
class PowerOfN{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any Number : ");
		int n = sc.nextInt();
		
		System.out.print("Enter the value of power : ");
		int x = sc.nextInt();
		
		System.out.println(n +  "^" + x + " : " + (int)Math.pow(n, x));
	}
}