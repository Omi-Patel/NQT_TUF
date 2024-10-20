import java.util.*;
class RecursiveArraySum{
	
	public static int sum(int i, int arr[]){
		if(i >= arr.length){
			return 0;
		}
		
		return arr[i] + sum(i+1, arr);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of an array : ");
		
		int n = sc.nextInt();
		
		System.out.print("Enter array's elements : ");
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Initial array : " + Arrays.toString(arr));
		
		System.out.println("Sum of an array : " + sum(0, arr));
			
		sc.close();
	}
}