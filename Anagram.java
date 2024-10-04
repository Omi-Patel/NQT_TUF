import java.util.*;
class Anagram{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st string : ");
		String str = sc.nextLine().toLowerCase();
		System.out.print("Enter 2nd string : ");
		String str2 = sc.nextLine().toLowerCase();
		
		// convert both string to character array
		char arr[] = str.toCharArray();
		char brr[] = str2.toCharArray();
		
		Arrays.sort(arr);
		Arrays.sort(brr);
		
		if(Arrays.equals(arr, brr)){
			System.out.println("Given Strings are Anagram");
		} else{
			System.out.println("Given Strings are not Anagram");
		}
		
		
		sc.close();
	}
}