import java.util.*;
class RotateArr{
	public static void main(String args[]){
		int arr[] = new int[]{1,2,3,4,5,6,7};
		int n = arr.length;
		int k = 8 % n;
		// op : {4,5,6,7,1,2,3}
		
		int ans[] = new int[n];
		int j = 0;
		
		for(int i=k; i<n; i++){
			ans[j++] = arr[i];
		}
		
		for(int i=0; i<k; i++){
			ans[j++] = arr[i];
		}
		
		System.out.println(Arrays.toString(ans));
	}
}