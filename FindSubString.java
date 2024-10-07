import java.util.*;
class FindSubString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String : ");
		String str = sc.next();
		System.out.print("Enter substring you want to find : ");
		String ss = sc.next();
		
		System.out.println("ANS : " + ss + " found at index " + str.indexOf(ss));
		
		sc.close();
	}
}