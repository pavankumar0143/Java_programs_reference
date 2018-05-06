package set_17;

import java.util.TreeSet;

public class NextMaxNum {
		
	public static void nextMax(int arr[]){
		TreeSet<Integer> set=new TreeSet<Integer>();
		
		for(int i=0;i<arr.length;i++){
			if(set.contains(arr[i])) continue;
			else
				set.add(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+"-->"+set.higher(arr[i]));
		}
	}
	public static void main(String[] args) {
		int arr[]={13,8,6,7,9,1,4,2};
		nextMax(arr);
	}
}
