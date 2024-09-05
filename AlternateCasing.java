import java.util.*;

class AlternateCasing{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any String without space : ");
		String str = sc.next();
		
		System.out.println("Giver String : " + str);
		
		int n = str.length();
		
		String ans = "";
		for(int i=0; i<n; i++){
			char ch = str.charAt(i);
			
			if(i % 2 == 0){
				ans += Character.toLowerCase(ch);
			} else {
				ans += Character.toUpperCase(ch);
			}
		}
		
		System.out.println("Answer : " + ans);
	}
}