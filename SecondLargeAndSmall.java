import java.util.*;
class SecondLargeAndSmall{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the Array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.print("Enter Array Element : ");
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("Second Largest Element : " + arr[n-2]);
		System.out.println("Second Smallest Element : " + arr[1]);
	}
}