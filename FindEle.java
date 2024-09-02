import java.util.*;
class FindEle{
	public static void main(String args[]){
		int arr[] = new int[]{1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		int k = 3;
		
		// Linear Search
		for(int i=0; i<arr.length; i++){
			if(arr[i] == k){
				System.out.println("Element " + k + " is present at " + i + " index");
			}
		}
	}
}