import java.util.*;
class PrimeFactors{
	
	public static boolean isPrime(int n){
		for(int i=2; i<=Math.sqrt(n); i++){
			if(n % i == 0){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=2; i<=n; i++){
			if(n % i == 0 && isPrime(i)){
				al.add(i);
			}
		}
		
		System.out.println("Prime Factors of " + n + " is : " + al);
	}
}