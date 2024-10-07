import java.util.*;
class ChangeCase{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String : ");
		String str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			
			if((ch >= 'a' && ch <= 'z')){
				sb.setCharAt(i, Character.toUpperCase(ch));
			} else if((ch >= 'A' && ch <= 'Z')){
				sb.setCharAt(i, Character.toLowerCase(ch));
			}
		}
		
		System.out.println("ANS : " + sb.toString());
		
		sc.close();
	}
}