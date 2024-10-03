import java.util.*;
class SumOfNumberInString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any String : ");
		String str = sc.nextLine();
		
		int sum = 0;
		String n = "";
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9'){
				n += ch;
			} else{
				if(n != ""){
					sum += Integer.parseInt(n);
					n = "";
				}
			}
		}
		
		if(n != ""){
			sum += Integer.parseInt(n);
			n = "";
		}
		
		System.out.println(str + " -> " + sum);
	}
}