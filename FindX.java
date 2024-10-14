import java.util.*;
class FindX{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any string with number series : ");
		String str = sc.nextLine();
		
		String s[] = str.split(" ");
		int arr[] = new int[s.length];
		
		for(int i=0; i<s.length; i++){
			arr[i] = Integer.parseInt(s[i]);			
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++){
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		Arrays.sort(arr);
		int maxEle = arr[arr.length - 1];
		int flag = 1;
		
		if(map.get(maxEle) > 1){
			System.out.println("No such x found.. Invalid Number Series");
			flag = 0;
			return;
		}
		
		for(int key : map.keySet()){
			if(map.get(key) > 2){
				System.out.println("No such x found.. Invalid Number Series");
				flag = 0;
				return;
			}
		}
		
		if(flag == 1){
			System.out.println("Such x found.. x : " + maxEle);
		}
		
		sc.close();
	}
}