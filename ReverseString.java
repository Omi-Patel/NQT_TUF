import java.util.*;
class ReverseString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any String : ");
		String str = sc.nextLine();
		
		StringBuilder ans = new StringBuilder();
		ans.append(str);
		
		ans.reverse();
		
		System.out.println("ANS : " + ans);
	}
}