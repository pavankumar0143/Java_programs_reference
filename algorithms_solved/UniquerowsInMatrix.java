import java.util.Arrays;

public class UniquerowsInMatrix {
	
	static void print(int mat[][],int i){
		System.out.println(Arrays.toString(mat[i]));
	}
	
	static void checkRows(int mat[][],int m,int n){
		int count=0;
		for(int i=0;i<m-1;i++){
			int k=i;
			count=0;
			for(int j=0;j<n-1;j++){
				if(k<m-1)
					if(mat[k][j]==mat[k+1][j]){
					}
				k++;
			}
			if(count==n){
				print(mat,i);
				i++;
			}
			else
				print(mat,i);
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
		System.out.println((int)Math.log10(1)+1);
		checkRows(arr,arr.length,arr[0].length);
	}
}
