import java.util.*;
class TotalIncome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int age[] = new int[]{20, 30, 40, 50, 2, 3, 14};
		
		int sum = 0;
		for(int i=0; i<age.length; i++){
			if(age[i] < 17){
				sum += 200;
			} else if(age[i] >= 17 && age[i] <= 40){
				sum += 400;
			} else if(age[i] > 40){
				sum += 300;
			}
		}
		
		System.out.println("Total Income : " + sum + " INR");
		
		sc.close();
	}
}