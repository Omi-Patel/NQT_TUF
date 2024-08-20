class AvgArr{
	public static void main(String args[]){
		int arr[] = new int[]{1,2,1,1,5,1};
		
		int n = arr.length;
		
		int sum = 0;
		for(int ele : arr){
			sum += ele;
		}
		
		float avg = (float)sum / n;
		System.out.println("Average : " + avg);
	}
}