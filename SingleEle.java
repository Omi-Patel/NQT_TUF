import java.util.*;
class SingleEle{
	public static void main(String args[]){
		int arr[] = new int[]{1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++){
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		for(int key : map.keySet()){
			if(map.get(key) == 1){
				System.out.println("Single Element : " + key);
				break;
			}
		}
	}
}