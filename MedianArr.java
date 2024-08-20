import java.util.*;
class MedianArr{
	public static void main(String args[]){
		int arr[] = new int[]{2,5,1,7};
		
		int n = arr.length;
		
		Arrays.sort(arr);
		
		if(n % 2 != 0){
			System.out.println(arr[n/2]);
		} else {
			float avg = (arr[n/2] + arr[(n/2)-1]) / (float)2;
			System.out.println(avg);
		}	
	}
}