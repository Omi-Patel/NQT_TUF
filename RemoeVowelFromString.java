import java.util.*;
class RemoveVowelFromString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any String : ");
		String str = sc.nextLine();
		
		String ans = "";
		
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			
			if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') || 
			   (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			){
				continue;
			} else {
				ans += ch;
			}
		}
		
		System.out.println("ANS : " + ans);
	}
}