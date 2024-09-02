import java.util.*;
class EquiIndex{
	public static void main(String args[]){
		int arr[] = new int[]{1,-1,4};
		System.out.println(Arrays.toString(arr));
		
		int totalSum = 0;
		
		for(int ele : arr){
			totalSum += ele;
		}
		
		int leftSum = 0;
		int rightSum = totalSum;
		
		for(int i=0; i<arr.length; i++){
			rightSum -= arr[i];
			
			if(leftSum == rightSum){
				System.out.println("Equilibrium Index = " + i + " Where LeftSum = RightSum");
				break;
			}
			
			leftSum += arr[i];
		}
	}
}