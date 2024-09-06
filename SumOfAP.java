import java.util.*;

class SumOfAP{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of terms in AP : ");
		int n = sc.nextInt();
		
		System.out.println();
		
		System.out.print("First term of AP : ");
		int a = sc.nextInt();
		
		System.out.println();
		
		System.out.print("Common difference of AP : ");
		int d = sc.nextInt();
		
		int term = a;
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0; i<n; i++){
			al.add(term);
			term += d;
		}
		
		int sum = 0;
		System.out.println(al);
		for(int ele : al){
			sum += ele;
		}
		System.out.println("Sum Of AP : " + sum);
	}
}

// Formule : Sn = n / 2 (2a + (n-1)d) 