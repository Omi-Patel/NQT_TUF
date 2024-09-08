import java.util.*;

class Fibonacci{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any Number : ");
		int n = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		int f = 0;
		int s = 1;
		al.add(f);
		al.add(s);
		for(int i=2; i<=n; i++){
			int t = f + s;
			al.add(t);
			f = s;
			s = t;
		}
		
		System.out.println("Fibonacci no. upto " + n + " term : " + al);
	}
}