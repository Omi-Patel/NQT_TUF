import java.util.*;
class CeaserCipher{
	
	public static String encryption(String pt, int key){
		String ans = "";
		for(int i=0; i<pt.length(); i++){
			char ch = pt.charAt(i);
			
			int temp = (int)ch + key;
			ans += (char)temp;
		}
		
		return ans;
	}
	
	public static String decryption(String ct, int key){
		String ans = "";
		for(int i=0; i<ct.length(); i++){
			char ch = ct.charAt(i);
			
			int temp = (int)ch - key;
			ans += (char)temp;
		}
		
		return ans;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1 for Encryption...");
		System.out.println("Press 2 for Decryption...");
		
		System.out.print("Enter Your Choice 1 or 2 : ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		String ans = "";
		
		if(choice == 1){
			System.out.print("Enter Plain Text : ");
			String pt = sc.nextLine();
		
			System.out.print("Enter the number key : ");
			int key = sc.nextInt() % 26;
			
			ans = encryption(pt, key);
			
			System.out.println("Encrypted Text : " + ans);
			
		} else if(choice == 2){
			System.out.print("Enter Cipher Text : ");
			String ct = sc.nextLine();
		
			System.out.print("Enter the number key : ");
			int key = sc.nextInt() % 26;
			
			ans = decryption(ct, key);
			
			System.out.println("Decrypted Text : " + ans);
		} else {
			System.out.println("Invalid Choice...");
		}
		
		sc.close();
	}
}