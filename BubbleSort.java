import java.util.*;

class BubbleSort{
	public static void main(String args[]){
		int arr[] = new int[]{5,4,3,2,1};
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-1-i; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted : " + Arrays.toString(arr));
	}
}