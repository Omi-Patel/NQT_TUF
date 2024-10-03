import java.util.*;
class RemoveBracket{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any String containing brackets : ");
		String str = sc.nextLine();
		
		String ans = "";
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			
			if(ch != '(' && ch != ')'){
				ans += ch;
			}
		}
		
		System.out.println("ANS : " + ans);
	}
}