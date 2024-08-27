import java.util.*;
class AddEle{
	public static void main(String args[]){
		int arr[] = new int[]{1,2,3,4,5};
		
		System.out.println("Initial Array : " + Arrays.toString(arr));
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int ele : arr){
			al.add(ele);
		}
		
		insertAtBegining(al, 9);
		insertAtEnd(al, 10);
		insertAtPos(al, 4, 8);
	}
	
	public static void insertAtBegining(ArrayList<Integer> al, int ele){
		al.add(0, ele);
		
		System.out.println("Element " + ele + " Inserted At Beggining " + "->" + al);
	}
	
	public static void insertAtEnd(ArrayList<Integer> al, int ele){
		al.add(ele);
		
		System.out.println("Element " + ele + " Inserted At End -> " + al);
	}
	
	public static void insertAtPos(ArrayList<Integer> al, int pos, int ele){
		al.add(pos-1, ele);
		
		System.out.println("Element " + ele + " Inserted At Position " + pos + " -> " + al);
	}
}