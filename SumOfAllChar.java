class SumOfAllChar{
	public static void main(String args[]){
		String s = "123";
		
		int sum = 0;
		
		for(int i=0; i<s.length(); i++){
			for(int j=i+1; j<s.length()+1; j++){
				sum += Integer.parseInt(s.substring(i, j));
			}
		}
		
		System.out.println("Sum Of All Char & Continous String : " + sum);
	}
}