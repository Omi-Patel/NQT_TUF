import java.util.*;
class ConcateString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st string : ");
		String s1 = sc.next();
		
		System.out.print("Enter 2nd string : ");
		String s2 = sc.next();
		
		System.out.println("ANS : " + s1.concat(s2));
		
		sc.close();
	}
}