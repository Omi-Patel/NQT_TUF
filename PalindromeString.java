class PalindromeString{
	public static void main(String args[]){
		String str = "OM PATEL";
		
		int i = 0;
		int j = str.length() - 1;
		int flag = 1;
		
		while(i <= j){
			if(str.charAt(i) != str.charAt(j)){
				flag = 0;
				break;
			}
			
			i++;
			j--;
		}
		
		if(flag == 1){
			System.out.println(str + " is Palindrome String.");
		} else {
			System.out.println(str + " is not Palindrome String.");
		}
	}
}