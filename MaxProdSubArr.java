import java.util.*;
class MaxProdSubArr{
	public static void main(String args[]){
		int arr[] = new int[]{-2, 3, -4, 0};
		System.out.println("Initial arr : " + Arrays.toString(arr));
		
		int maxProd = Integer.MIN_VALUE;
		int pre = 1;
		int suf = 1;
		
		for(int i=0; i<arr.length; i++){
			if(pre == 0) pre = 1;
			if(suf == 0) suf = 1;
			
			pre *= arr[i];
			suf *= arr[arr.length-i-1];
			
			maxProd = Math.max(maxProd, Math.max(pre, suf));
		}
		
		System.out.println("Max Product in the arr : " + maxProd);
	}
}