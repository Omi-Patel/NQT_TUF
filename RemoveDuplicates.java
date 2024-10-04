import java.util.*;
class RemoveDuplicates{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String : ");
		String str = sc.nextLine();
		
		ArrayList<Character> al = new ArrayList<>();
		for(int i=0; i<str.length(); i++){
			if(!al.contains(str.charAt(i))){
				al.add(str.charAt(i));
			}
		}
		
		String ans = "";
		for(char ch : al){
			ans += ch;
		}
		
		System.out.println("After removing duplicates : " + ans);
		
		sc.close();
	}
}