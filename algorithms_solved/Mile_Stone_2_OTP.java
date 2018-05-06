package demo;

public class Mile_Stone_2_OTP {
	public static int getMin(int in,int min){
		if(in <min) return (in);
		else return (min);
	}
	public static int getMax(Integer in,int max){
		if(in >max) return (in);
		else return (max);
	}
	
	public static String genSet1(int []i1,int i2){
		String s="";
		String temp="";
		int k=0,min=999999;
		for(int i=0;i<i2;i++){
			temp=String.valueOf(i1[i]);
			for(int j=0;j<temp.length()-1;j++){
				k=j;
				if(k+2>=temp.length()){
				s=s+" "+temp.substring(j);
				break;
				}
				else
					s=s+" "+temp.substring(j, j+2);
			}
		}
			String []S=s.split(" ");
			for(int p=1;p<S.length;p++){
				min=getMin(Integer.valueOf(S[p]),min);
			}
		if(min==999999) return "0";
		return String.valueOf(min);
	}
	public static String genSet2(int[]n,int in){
		int min=999999,max=0;
		boolean arr[]=new boolean[10];
		for(int i=0;i<in;i++){
			while(n[i]>0){
				int tp=n[i]%10;
				arr[tp]=true;
				n[i]=n[i]/10;
				}
		}
		for(int j=0;j<10;j++){
			if(arr[j]){
				min=getMin(j,min);
				max=getMax(j,max);
			}
		}
		if(min==max) return "0";
		else return String.valueOf(min+max);
	}
public static void main(String[] args) {
	int []inp1={123,11567,791,467};
	int []inp3=inp1;
	int inp2=inp1.length;
	String res1=genSet1(inp1,inp2);
	String res2=genSet2(inp3,inp2);
	System.out.println(res1+" "+res2);
}
}
