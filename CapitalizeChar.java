import java.util.*;
class CapitalizeChar{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any String : ");
		String str = sc.nextLine();
		
		StringBuilder ans = new StringBuilder();
		ans.append(str);
		
		ans.setCharAt(0, Character.toUpperCase(str.charAt(0)));
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			
			if(ch == ' '){
				ans.setCharAt(i-1, Character.toUpperCase(str.charAt(i-1)));
				ans.setCharAt(i+1, Character.toUpperCase(str.charAt(i+1)));
			}
		}
		ans.setCharAt(str.length()-1, Character.toUpperCase(str.charAt(str.length()-1)));
		
		System.out.println("ANS : " + ans);
	}
}