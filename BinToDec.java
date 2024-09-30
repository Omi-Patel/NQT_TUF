import java.util.*;
class BinToDec{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any binary string : ");
		String s = sc.next();
		
		int n = s.length();
		int sum = 0;
		for(int i=0; i<n; i++){
			sum = sum + (int)(Math.pow(2, n-i-1) * ((int)s.charAt(i) - (int)'0'));
		}
		
		System.out.println(s + " : " + sum);
	}
}