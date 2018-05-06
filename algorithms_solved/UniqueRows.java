import java.util.Arrays;
import java.util.HashMap;

public class UniqueRows {
	
	public static String toString(int arr[][],int row){
		return Arrays.toString(arr[row]);
	}
	public static HashMap<Integer,String> toMap(int arr[][],int size){
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		for(int i=0;i<size;i++){
				String val=toString(arr,i);
				if(!map.containsValue(val.replace(",", ""))){
					map.put(i, val.replace(",", ""));
				}
		}
		return map;
	}
	public static void print(HashMap<Integer,String> map){
		for(int i:map.keySet()){
			System.out.println((map.get(i)));
			
		}
	}
	public static void main(String[] args) {
		int arr[][]={
				{0, 1, 0, 0, 1},
		        {1, 0, 1, 1, 0},
		        {0, 1, 0, 0, 1},
		        {1, 0, 1, 0, 0},
		        {1,1,1,0,0},
		        {0,0,1,1,0},
		        {1,1,1,0,0}};
		print(toMap(arr,arr.length));
	}
}
