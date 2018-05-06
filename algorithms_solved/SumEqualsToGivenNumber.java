import java.util.HashMap;

public class SumEqualsToGivenNumber {
	public static void findNum(int arr[],int size,int sum){
		HashMap<Integer,Boolean> map=new HashMap<Integer,Boolean>();
		for(int i=0;i<size;i++){
			map.put(arr[i], true);
		}
		for(int i=0;i<size;i++){
			int temp=sum-arr[i];
			if(map.containsKey(temp)){
				System.out.println(temp+" "+arr[i]);
					break;
			}
			
		}
	}
	public static void main(String[] args) {
		int arr[]={1,4,45,6,10,8};
	findNum(arr,arr.length,8);
	String s="";
	
	}
}
