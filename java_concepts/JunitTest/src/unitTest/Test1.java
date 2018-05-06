package unitTest;

public class Test1 {
	public  int ADD(int a,int b){
	return a+b;
	}
	public  int SUB(int a,int b){
		return a-b;
	}
	public  int Arr(int a[]){
		int a1=a[0];
		for(int i=0;i<a.length;i++){
			if(a1>a[i]){
				a1=a[i];
			}
		}
			return a1;
	}
	public static boolean boo(int a){
		if (a==5)
			return true;
		else
			return false;
	}
}
