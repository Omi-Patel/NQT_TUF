import java.util.*;

class NumberOfWord{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any string : ");
		String str = sc.nextLine();
		
		String arr[] = str.split(" ");
		
		System.out.println("Total Words : " + arr.length);
		
		sc.close();
	}
}