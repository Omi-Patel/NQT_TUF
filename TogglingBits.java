import java.util.*;
class TogglingBits{
	
	public static String covertToBin(int dec){
		String bin = Integer.toBinaryString(dec);
		
		return bin;
	}
	
	public static String toggleBit(String bin){
		String toggle = "";
		
		for(int i=0; i<bin.length(); i++){
			if(bin.charAt(i) == '0'){
				toggle += '1';
			} else {
				toggle += '0';
			}
		}
		
		return toggle;
	}
	
	public static int convertToDec(String toggle){
		int n = toggle.length();
		
		int ans = 0;
		for(int i=0; i<n; i++){
			char ch = toggle.charAt(i);
			int num = Integer.parseInt(""+ch);
			
			ans += Math.pow(2, n-i-1) * num;
		}
		
		return ans;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any positive number : ");
		int dec = sc.nextInt();
		
		String bin = covertToBin(dec);
		
		String toggle = toggleBit(bin);
		
		int decimal = convertToDec(toggle);
		
		System.out.println("After Coverting " + dec + " to Binary : " + bin);
		System.out.println("After Toggling the bits from " + bin + " to " + toggle);
		System.out.println("Final Answer : " + decimal);
		
		sc.close();
	}
}