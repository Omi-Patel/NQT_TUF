import java.util.*;
class SumOfString{
	public static int findMaxDigit(char ch){
		int ascii = (int)ch;
		int max = Integer.MIN_VALUE;
		while(ascii > 0){
			int rem = ascii % 10;
			max = Math.max(max, rem);
			ascii /= 10;
		}
		
		return max;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any string containing numbers and characters : ");
		String str = sc.next();
		
		int sum = 0;
		
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(Character.isDigit(ch)){
				sum += Integer.parseInt(""+ch);
			} else {
				sum += findMaxDigit(ch);
			}
		}
		
		System.out.println("Sum of each Character : " + sum);
	}
}