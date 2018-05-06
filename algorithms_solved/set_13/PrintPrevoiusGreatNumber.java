package set_13;

public class PrintPrevoiusGreatNumber {
		static int max=0;
		static void printnum(int arr[],int n){
			max=arr[0];
			System.out.print(arr[0]+" ");
			for(int i=1;i<n;i++){
				if(arr[i-1]<arr[i]){
					if(arr[i]>max){
						max=arr[i];
						System.out.print(max+" ");
						
					}
				}
			}
		}
		public static void main(String[] args) {
			int arr[]={2, -3, -4, 5, 9, 7, 8};
			printnum(arr,arr.length);
		}
}
