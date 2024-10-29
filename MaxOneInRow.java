import java.util.*;
class MaxOneInRow{
	public static void main(String args[]){
		int arr[][] = new int[][]{{0, 1, 0}, {1, 1, 0}, {1, 1, 1}};
		
		int ans = -1;
		int max = 0;
		for(int i=0; i<arr.length; i++){
			int count = 0;
			
			for(int j=0; j<arr[i].length; j++){
				if(arr[i][j] == 1){
					count++;
				}
			}
			
			if(count > max){
				max = count;
				ans = i+1;
			}
		}
		
		System.out.println(ans + " Row has Maximum One's.");
	}
}