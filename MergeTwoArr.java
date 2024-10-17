import java.util.*;
class MergeTwoArr{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of N : ");
		int n = sc.nextInt();
		
		System.out.print("Enter the value of M : ");
		int m = sc.nextInt();
		
		int arr[] = new int[n];
		
		int ans[] = new int[n+m];
		int k=0;
		
		System.out.print("Enter arr of size N : ");
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
			ans[k++] = arr[i];
		}
		
		int brr[] = new int[m];
		System.out.print("Enter arr of size M : ");
		
		for(int i=0; i<m; i++){
			brr[i] = sc.nextInt();
			ans[k++] = brr[i];
		}
		
		Arrays.sort(ans);
		
		System.out.println("Sorted Merged Arr : " + Arrays.toString(ans));
		
		sc.close();
	}
}