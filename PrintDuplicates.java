import java.util.*;
class PrintDuplicates{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string : ");
		String str = sc.nextLine();
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		
		for(char key : map.keySet()){
			if(map.get(key) > 1){
				System.out.println(key + " : " + map.get(key));
			}
		}
		
		sc.close();
	}
}