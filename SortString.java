import java.util.*;
class SortString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any string : ");
		String s = sc.next();
		
		char arr[] = s.toCharArray();
		
		Arrays.sort(arr);
		
		String ans = new String(arr);
		System.out.println("ANS : " + ans);
		
		sc.close();
	}
}