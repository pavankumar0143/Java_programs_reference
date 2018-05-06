
public class Exp1 {
	public static void main(String[] args){
	int a[]={1,23,4,2,1,5,4,3};
	int sum=0;
	for(int i=0;i<a.length-1;i++){
		sum=sum+a[i];
	}
	System.out.println("Sum="+sum+" Avg="+(sum/a.length));
	}
}
