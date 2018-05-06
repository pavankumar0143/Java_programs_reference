package set_24;

import java.util.HashMap;

public class FindOccurences {
	static HashMap<Integer,Integer> check(int arr[]){
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i])+1);
			}
			else{
				map.put(arr[i], 1);
			}
		}
		return map;
	}
	static void printOccurences(int arr[]){
		HashMap<Integer,Integer> map=check(arr);
		for(Integer i:map.keySet()){
			if(map.get(arr[i])>1){
				System.out.println(i+"-->"+map.get(arr[i]));
			}
		}
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,2,3,2,4,5,6,6,5,4,3,1,1,8,9,};
		printOccurences(arr);
	}
}