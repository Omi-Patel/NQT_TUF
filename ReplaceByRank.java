import java.util.*;
class RplaceByRank{
	public static void main(String args[]){
		int arr[] = new int[]{20, 15, 26, 2, 98, 6};
		System.out.println("Input : " + Arrays.toString(arr));
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<arr.length; i++){
			
			if(!al.contains(arr[i])){
				al.add(arr[i]);
			}
		}
		
		Collections.sort(al);
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<al.size(); j++){
				if(arr[i] == al.get(j)){
					arr[i] = j+1;
				}
			}
		}
		
		System.out.println("Answer : " + Arrays.toString(arr));
	}
}