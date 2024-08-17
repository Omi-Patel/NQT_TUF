class SumOfArr{
	public static void main(String args[]){
		int arr[] = new int[]{1,2,1,1,5,1};
		
		int sum = 0;
		for(int ele : arr){
			sum += ele;
		}
		
		System.out.println(sum);
	}
}