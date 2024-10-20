import java.util.*;
class MaxInParty{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int e[] = new int[]{7,0,5,1,3};
		int l[] = new int[]{1,2,1,3,4};
	
		int max = 0;
		int sum = 0;
		
		for(int i=0; i<e.length; i++){
			sum += (e[i] - l[i]);
			
			max = Math.max(max, sum);
		}
		
		System.out.println("Maximum number of guests in party at an instance : " + max);
		
		sc.close();
	}
}