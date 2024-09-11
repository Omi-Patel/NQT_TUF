import java.util.*;
class NoOfPermutation{
	
	public static int fact(int n){
		if(n == 0 || n == 1){
			return 1;
		}
		
		return n * fact(n-1);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any string : ");
		String str = sc.next();
		
		HashMap<Character, Integer> st = new HashMap<>();
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(!st.containsKey(ch)){
				st.put(ch, 1);
			} else {
				st.put(ch, st.get(ch) + 1);
			}
		}
		
		int ans = fact(str.length());
		
		
		for(Character key : st.keySet()){
			ans /= fact(st.get(key));
		}
		
		System.out.println("No. of Permutations : " + ans);
	}
}