import java.util.*;
class Capacity{
	
	public static int estimateTime(int weight){
		if(weight == 0){
			return 0;
		} else if(weight > 0 && weight <= 2000){
			return 25;
		} else if(weight > 2000 && weight <= 4000){
			return 35;
		} else if(weight > 4000 && weight <= 7000){
			return 45;
		} else {
			return -1;
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the weight in gms : ");
		int w = sc.nextInt();
		
		if(w < 0){
			System.out.println("Invalid Input");
			return;
		}
		
		int ans = estimateTime(w);
		
		if(ans == -1){
			System.out.println("Overloaded!!");
			return;
		}
		
		System.out.println("Time Estimated : " + ans + " Minutes");
		
		sc.close();
	}
}