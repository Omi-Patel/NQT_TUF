import java.util.*;
class PriorElements{
	public static void main(String args[]){
		int arr[] = new int[]{7,4,8,2,9};
		int n = arr.length;
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0; i<n; i++){
			int flag = 1;
			for(int j=i; j>=0; j--){
				if(arr[j] > arr[i]){
					flag = 0;
					break;
				}
			}
			
			if(flag == 1){
				al.add(arr[i]);
			}
		}
		
		System.out.println("Prior Elements : " + al + " Size : " + al.size());
	}
}