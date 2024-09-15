import java.util.*;
class Factor{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=1; i<=n; i++){
			if(n % i == 0){
				al.add(i);
			}
		}
		
		System.out.println("Factors of " + n + " is : " + al);
	}
}