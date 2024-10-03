import java.util.*;
class FreqOfChar{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any String : ");
		String str = sc.nextLine();
		
		HashMap<Character, Integer> mp = new HashMap<>();
		
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			
			if(mp.containsKey(ch)){
				mp.put(ch, mp.get(ch) + 1);
			} else {
				mp.put(ch, 1);
			}
		}
		
		System.out.println(mp);
	}
}