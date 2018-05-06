import java.util.*;

public class Exp8 {
public static void main(String[] args) {
	int arr[]=new int[]{4,9,2,49,27,2,8,39,33,32,4,39,4,7,27,4};
	int n=arr.length,count=0,max_count=0,max_count_index=0;
	Arrays.sort(arr);
	for(int i=0;i<n;i++){
		count=0;
		while(i<n-1 && arr[i]==arr[i+1]){
			count++;
			i++;
		}
		if(count>max_count){
			max_count=count;
			max_count_index=i;
		}
	}
     System.out.println(arr[max_count_index]);
	
}
}
