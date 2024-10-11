import java.util.*;
class LeaderInArray{
	public static void main(String args[]){
		int arr[] = new int[]{10,4,2,4,1};
		int n = arr.length;
		
		ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            int flag = 1;
            for(int j=i+1; j<n; j++){
                if(arr[j] > arr[i]){
                    flag = 0;
                    break;
                }
            }
            
            if(flag == 1){
                al.add(arr[i]);
            }
        }
		
		System.out.println("Leaders in arr : " + al);
	}
}