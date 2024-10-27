import java.util.*;
class CeaserCipher{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Plain Text : ");
		String pt = sc.nextLine();
		
		System.out.print("Enter the number key : ");
		int key = sc.nextInt() % 26;
		
		String ans = "";
		for(int i=0; i<pt.length(); i++){
			char ch = pt.charAt(i);
			
			int temp = (int)ch + key;
			ans += (char)temp;
		}
		
		
		System.out.println("Encrypted Text : " + ans);
		
		sc.close();
	}
}