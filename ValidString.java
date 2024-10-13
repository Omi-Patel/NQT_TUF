import java.util.*;
class ValidString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string containing * and # : ");
		String s = sc.next();
		
		int sCount = 0;
		int hCount = 0;
		
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			
			if(ch == '*'){
				sCount++;
			} else if(ch == '#'){
				hCount++;
			}
		}
		
		if(sCount == hCount){
			System.out.println("Equal Count : 0");
		} else if(sCount > hCount){
			System.out.println("Positive Count : 1");
		} else {
			System.out.println("Negative Count : -1");
		}
		
		sc.close();
	}
}