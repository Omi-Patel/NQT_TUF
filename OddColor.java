import java.util.*;
class OddColor{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total number of colors : ");
		int n = sc.nextInt();
		
		String arr[] = new String[n];
		
		System.out.println("Enter colors of baloons : ");
		
		for(int i=0; i<n; i++){
			arr[i] = sc.next();
		}
		
		HashMap<String, Integer> map = new LinkedHashMap<>();
		for(int i=0; i<n; i++){
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		System.out.println(map);
		int flag = 0;
		for(String key : map.keySet()){
			if(map.get(key) % 2 != 0){
				System.out.println("Odd Number Color : " + key);
				flag = 1;
				break;
			}
		}
		
		if(flag == 0){
			System.out.println("All Even Colors");
		}
		
		sc.close();
	}
}