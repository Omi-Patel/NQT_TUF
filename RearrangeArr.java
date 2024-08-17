import java.util.*;
class RearrangeArr{
	public static void main(String args[]){
		int arr[] = new int[]{8, 7, 1, 6, 5, 9};
		//Rearrange the array such that the first half is arranged in increasing order, 
		//and the second half is arranged in decreasing order
		//Output: 1 5 6 9 8 7
		
		Arrays.sort(arr);
		
		int n = arr.length;
		
		for(int i=0; i<n/2; i++){
			System.out.print(arr[i] + " ");
		}
		
		for(int i=n-1; i>=n/2; i--){
			System.out.print(arr[i] + " ");
		}
	}
}