import java.util.*;
class ChangeLetter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String : ");
		String str = sc.next();
		
		String ans = "";
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			
			if(ch == 'z'){
				ans += 'a';
			} else if(ch == 'Z'){
				ans += 'A';
			} else if((ch >= 'a' && ch < 'z') || (ch >= 'A' && ch < 'Z')) {
				int ascii = ch;
				ans += (char)(ascii+1);
			}
		}
		
		System.out.println("ANS : " + ans);
		
		sc.close();
	}
}