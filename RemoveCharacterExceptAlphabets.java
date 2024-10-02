import java.util.*;
class RemoveCharacterExceptAlphabets{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any String : ");
		String str = sc.nextLine();
		
		String ans = "";
		
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
				ans += ch;
			} else {
				continue;
			}
		}
		
		System.out.println("ANS : " + ans);
	}
}