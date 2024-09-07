import java.util.*;
class LeapYearOrNot{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any Year : ");
		int y = sc.nextInt();
		
		if(((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0)){
			System.out.println(y + " is a Leap Year.");
		} else {
			System.out.println(y + " is not a Leap Year.");
		}
	}
}