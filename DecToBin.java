import java.util.*;
class DecToBin{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any Decimal number : ");
		int n = sc.nextInt();
		int temp = n;
		
		ArrayList<Integer> al = new ArrayList<>();
		while(n > 0){
			int rem = n % 2;
			al.add(rem);
			n /= 2;
		}
		
		Collections.reverse(al);
		
		String ans = "";
		for(int ele : al){
			ans += ""+ele;
		}
		System.out.println(temp + " : " + ans);
	}
}