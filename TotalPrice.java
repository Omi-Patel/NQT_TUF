import java.util.*;
class TotalPrice{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the product code : ");
		int n = sc.nextInt();
		
		int temp = n;
		int prod = 1;
		while(temp > 0){
			int rem = temp % 10;
			prod *= rem;
			temp /= 10;
		}
		
		System.out.println("Total Price of the Product is : " + prod);
		
		sc.close();
	}
}