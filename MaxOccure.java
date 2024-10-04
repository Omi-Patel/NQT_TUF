import java.util.*;
class MaxOccure{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any String : ");
		String str = sc.nextLine();
		
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		
		int max = 0;
		char ans = '0';
		for(char key : map.keySet()){
			if(map.get(key) > max){
				max = map.get(key);
				ans = key;
			}
		}
		
		System.out.println("Max Occurence : " + ans);
		
		sc.close();
	}
}