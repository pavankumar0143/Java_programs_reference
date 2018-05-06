package demo;

public class rotateMatrix {
	static int n=4;
	static int num=1;
	boolean arr1[][]=new boolean[n][n];
	void right(int arr[][],int r,int c,int size){
		for(int i=c;i<size;i++){
			//arr[r][i]=num;
			//num++;
			if(!arr1[r][i]){
			arr1[r][i]=true;
			arr[r][i]=num;
			num++;
			System.out.print(r+" "+i+",");
			}
		}
		System.out.println();
	}
		
	void down(int arr[][],int r,int c,int size){
		for(int i=r;i<size;i++){
			//arr[i][c]=num;
			//num++;
			if(!arr1[i][c]){
			arr1[i][c]=true;
			arr[i][c]=num;
			num++;
			System.out.println(i+" "+c);
			}
		}
		System.out.println();
	}
	void left(int arr[][],int r,int c,int size){
		for(int i=c;i>=0 ;i--){
			//arr[r][i]=num;
			//num++;
			if(!arr1[r][i]){
			arr1[r][i]=true;
			arr[r][i]=num;
			num++;
			System.out.print(r+" "+i+",");
		}
		}
		System.out.println();
	}
	void up(int arr[][],int r,int c,int size){
		for(int i=r;i>=0 ;i--){
			//
			if(!arr1[i][c]){
			arr1[i][c]=true;
			arr[i][c]=num;
			num++;
			System.out.println(i+" "+c);
		}
		}
	}
	void rotate(int arr[][],int size){
		if(size==0){
			return;
		}
		else{
			right(arr,n-size,n-size,size);
			down(arr,n-size+1,size-1,size);
			left(arr,size-1,size-1,size);
			up(arr,size-1,n-size,size-1);
			rotate(arr,size-1);
		}
	}
	public static void main(String[] args) {
		int size=4;
		int [][] arr=new int[size][size];
		rotateMatrix rM=new rotateMatrix();
		rM.rotate(arr,size);
		/*for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}*/
		
	}
}
