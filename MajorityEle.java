import java.util.*;
class MajorityEle{
	public static void main(String args[]){
		int arr[] = new int[]{3, 1, 3, 3, 2, 2, 2, 2};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++){
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		int max = 0;
		int ans = 0;
		for(int key : map.keySet()){
			if(map.get(key) > max){
				max = map.get(key);
				ans = key;
			}
		}
		
		System.out.println("Majority Element : " + ans);
	}
}