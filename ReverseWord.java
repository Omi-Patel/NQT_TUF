import java.util.*;
class ReverseWord{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string : ");
		String str = sc.nextLine();
		
		String word[] = str.split(" ");
		
		String ans = "";
		
		for(int i=word.length-1; i>=0; i--){
			if(i == 0){
				ans += word[i];
			} else {
				ans += word[i] + " ";
			}
		}
		
		System.out.println("REVERSE : " + ans);
		
		sc.close();
	}
}