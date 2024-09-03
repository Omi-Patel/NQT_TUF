import java.util.*;
class SubsetOfArr{
	public static void main(String args[]){
		int arr1[] = new int[]{1,3,4,5,2};
		int arr2[] = new int[]{4,5,2};
		
		// An array is called a subset of another if all of its elements are present in the other array.
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int ele : arr2){
			al.add(ele);
		}
		
		int flag = 1;
		for(int ele : arr1){
			if(!al.contains(ele)){
				flag = 0;
				break;
			}
		}
		
		String res = "";
		
		res = (flag == 1) ? "TRUE : Arr1 is a subset of Arr2" : "FALSE : Arr1 is not a subset of Arr2";
		
		System.out.println(res);
	}
}