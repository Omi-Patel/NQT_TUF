import java.util.*;
class ReverseArr{
	public static void main(String args[]){
		int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int ans[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++){
			ans[i] = arr[arr.length-i-1];
		}
		
		System.out.println(Arrays.toString(ans));
	}
}