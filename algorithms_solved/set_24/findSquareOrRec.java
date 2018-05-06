package set_24;

public class findSquareOrRec {
	static int cal(int x1,int x2 ,int y1,int y2){
		return (int) (Math.sqrt(Math.pow((x2-x1), 2))+Math.pow((y2-y1), 2));
	}
	static String check_square(int x[],int y[]){
		int arr[]=new int[6];
		int c_p=0;
		for(int i=0;i<4;i++){
			arr[i]=cal(x[c_p],x[c_p+1],y[c_p],y[c_p+1]);
		}
		c_p=1;
		for(int i=4;i<6;i++){
			arr[i]=cal(x[c_p],x[c_p+2],y[c_p],y[c_p+2]);
			c_p=0;
		}
		if(arr[0]==arr[2] && arr[1]==arr[3] && arr[0]==arr[1]&& arr[4]==arr[5]){
			return "Square";
		}
		else if(arr[0]==arr[2] && arr[1]==arr[3] && arr[4]==arr[5]){
			return "rectangle";
		}
		return "none";
	}
	public static void main(String[] args) {
		int x[]={0,1,1,1};
		int y[]={0,0,0,1};
		System.out.println(check_square(x,y));
		
	}
}
