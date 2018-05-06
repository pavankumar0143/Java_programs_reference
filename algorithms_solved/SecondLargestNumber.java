
public class SecondLargestNumber {
	public static int secNum(int arr[],int n){
		int i,first,second;
		first=second=Integer.MIN_VALUE;
		for(i=0;i<n;i++){
			if(arr[i]>first){
				second=first;
				first=arr[i];
			}
			else if (arr[i]>second && arr[i]!=first){
				second=arr[i];
			}
		}
		return second;
	}
	public static void main(String[] args) {
		int arr[]={1,2,7,3,8,10,1,3,9};
		System.out.println(secNum(arr,arr.length));
	}
}
