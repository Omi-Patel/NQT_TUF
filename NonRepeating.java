import java.util.*;
class NonRepeating{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string : ");
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
		
		ArrayList<Character> al = new ArrayList<>();
		for(char key : map.keySet()){
			if(map.get(key) == 1){
				al.add(key);
			}
		}
		
		System.out.println("Non Repetaing Character in string : " + al);
		
		sc.close();
	}
}