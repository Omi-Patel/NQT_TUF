import java.util.*;
class HighFreqWord{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string : ");
		String str = sc.nextLine();
		
		String arr[] = str.split(" ");
		
		String ans = "";
		int max = 1;
		
		for(int i=0; i<arr.length; i++){
			String word = arr[i];
			
			HashMap<Character, Integer> map = new LinkedHashMap<>();
			for(int j=0; j<word.length(); j++){
				char ch = word.charAt(j);
				
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			}
			
			for(char key : map.keySet()){
				if(map.get(key) > max){
					max = map.get(key);
					ans = word;
				}
			}
			
			System.out.println(map);
		}
		
		if(ans != ""){
			System.out.println("ANS : " + ans);
		} else {
			System.out.println("ANS : " + -1);
		}
		
		sc.close();
	}
}