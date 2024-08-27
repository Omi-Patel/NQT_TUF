import java.util.*;

class AllRepeating{
	public static void main(String args[]){
		int arr[] = new int[]{1,1,2,3,4,4,5,2};
		System.out.println("Initial Array : " + Arrays.toString(arr));
		
		// Finding repeating element using HashMap
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		
		// Iterating over the map
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(Integer key : map.keySet()){
			if(map.get(key) > 1){
				al.add(key);
			}
		}
		
		System.out.println("Repeating elements : " + al);
	}
}