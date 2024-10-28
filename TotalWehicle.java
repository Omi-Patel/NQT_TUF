import java.util.*;

class TotalWehicle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter total number of vehicle : ");
		int v = sc.nextInt();
		
		System.out.print("Enter total number of wheels : ");
		int w = sc.nextInt();
		
		if(v > w){
			System.out.println("Invalid Input..");
			return;
		}
		
		if(w < 2){
			System.out.println("Invalid Input..");
			return;
		}
		
		if(w % 2 != 0){
			System.out.println("Invalid Input..");
			return;
		}
		
		int fw = w/2 - v;
		int tw = 2*v - w/2;
		
		System.out.println("Possible Vehicles : " + " Two Wheelers : " + tw + " & Four Wheelers : " + fw);
		
		sc.close();
	}
}