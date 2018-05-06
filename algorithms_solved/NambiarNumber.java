package demo;

public class NambiarNumber {
	int res=0;
	public  void genNum(int n,int arr[]){
		int sum=0;
		int i=n;
		if(n==arr.length){
			
		}
		else if(i+1==arr.length){
			sum=arr[i];
			res=res*10+sum;
		}
		else if(arr[i]%2==0){
			sum=arr[i];
			for(i=n+1;i<arr.length;i++){
				sum=sum+arr[i];
				System.out.println(sum);
				if(sum%2==1 || i+1==arr.length){
					res=res*10+sum;
					genNum(i+1,arr);
					break;
				}
			}
		}
		else if(arr[i]%2==1){
			sum=arr[i];
			for(i=n+1;i<arr.length;i++){
				sum=sum+arr[i];
				System.out.println(sum);
				if(sum%2==0 || i+1==arr.length){
					res=res*10+sum;
					genNum(i+1,arr);
					break;
				}
			}
		}
	}		
				

	public static void main(String[] args) {
		String in="8123454210";
		int arr[]=new int[in.length()];
		for(int i=0;i<in.length();i++){
			arr[i]=Integer.valueOf(in.substring(i,i+1));
		}
		NambiarNumber Nm=new NambiarNumber();
		Nm.genNum(0,arr);
		System.out.println(Nm.res);
	}
}
