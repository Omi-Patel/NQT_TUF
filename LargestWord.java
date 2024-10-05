import java.util.*;
class LargestWord{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string : ");
		String str = sc.nextLine();
		
		String word[] = str.split(" ");
		String max = "";
		
		for(String ele : word){
			if(ele.length() > max.length()){
				max = ele;
			}
		}
		
		System.out.println("ANS : " + max);
		
		sc.close();
	}
}