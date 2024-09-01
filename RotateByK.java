import java.util.*;
class RotateByK{
	public static void main(String args[]){
		int arr[] = new int[]{3,7,8,9,10,11};
		System.out.println("Initial Arr : " + Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of K : ");
		int k = sc.nextInt() % arr.length;
		System.out.println();
		
		System.out.print("Direction of rotation left/right : ");
		String dir = sc.next();
		System.out.println();
		
		
		ArrayList<Integer> al = new ArrayList<>();
		
		if(dir.equals("left")){
			for(int i=k; i<arr.length; i++){
				al.add(arr[i]);
			}
			
			for(int i=0; i<k; i++){
				al.add(arr[i]);
			}
			
			System.out.println("Left Rotation : " + al);
		} else {
			for(int i=arr.length-1; i>=arr.length-k; i--){
				al.add(0, arr[i]);
			}
			
			for(int i=0; i<arr.length-k; i++){
				al.add(arr[i]);
			}
			
			System.out.println("Right Rotation : " + al);
		}
	}
}