import java.util.*;
class FrequencyEle{
	public static void main(String args[]){
		int arr[] = new int[]{2,2,3,4,4,2};
		
		HashMap<Integer, Integer> hm = new LinkedHashMap<>();
		
		for(int i=0; i<arr.length; i++){
			if(hm.containsKey(arr[i])){
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}
		
		System.out.println(hm);
	}
}