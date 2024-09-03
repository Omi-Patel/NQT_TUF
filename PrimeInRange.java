import java.util.*;
class PrimeInRange{
	
	public static void prime(int n, ArrayList<Integer> al){

		int flag = 1;
		for(int i=2; i<=Math.sqrt(n); i++){
			if(n % i == 0){
				flag = 0;
				break;
			}
		}
		
		if(flag == 1){
			al.add(n);
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the range : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println();
		
		if(n > m){
			System.out.println("Please Enter a valid Range...!");
		}
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=n; i<=m; i++){
			prime(i, al);
		}
		
		System.out.println("List of Prime Numbers b/n [" + n + "," + m + "] :" + al);
	}
}