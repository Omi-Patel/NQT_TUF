import java.util.*;
class RemoveFromFirst{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st String : ");
		String s1 = sc.next();
		
		System.out.print("Enter 2nd String : ");
		String s2 = sc.next();
		
		String ans = "";
		for(int i=0; i<s1.length(); i++){
			char ch = s1.charAt(i);
			
			if(!s2.contains(""+ch)){
				ans += ch;
			}
		}
		
		System.out.println("ANS : " + ans);
		
		sc.close();
	}
}