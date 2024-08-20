import java.util.*;
class UniqueEle{
	public static void main(String args[]){
		int arr[] = new int[]{1,1,1,2,2,3,3,3,3,4,4};
		
		HashSet<Integer> st = new HashSet<>();
		
		for(int ele : arr){
			st.add(ele);
		}
		
		System.out.println("Input Array : " + Arrays.toString(arr));
		
		System.out.println("Unique Elements in the Array : " + st.size());
	}	
}