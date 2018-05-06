package arrays;

import java.util.HashMap;

// Given array return indices whose sum equal to given value 
public class Two_sums {
	static int[] twoSums(int num[],int target){
		int arr[]=new int[2];
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<num.length;i++){
			Integer val=map.get(target-num[i]);
			if(val==null){
				map.put(num[i], i);
			}
			else{
				arr[0]=val;
				arr[1]=i;
				System.out.println(val+" "+i);
			}
		}
		return arr;
	}
	public static void main(String args[]){
		int num[]={1,2,5,9,8,7,4};
		int target=10;
		int arr[]=twoSums(num,target);
		System.out.println(arr[0]+" "+arr[1]);
	}
}
