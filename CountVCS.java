import java.util.*;
class CountVCS{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any String : ");
		String str = sc.nextLine();
		String s = str.toLowerCase();
		
		int vowel = 0;
		int consonent = 0;
		int space = 0;
		
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				vowel++;
			} else if(ch >= 'a' && ch <= 'z'){
				consonent++;
			} else if(ch == ' '){
				space++;
			}
		}
		
		System.out.println("Vowel : " + vowel);
		System.out.println("Consonent : " + consonent);
		System.out.println("Spaces : " + space);
	}
}