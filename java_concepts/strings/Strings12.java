
public class Strings12 {
	public static String ret(String S,int n){
		int l=S.length();
		String S1="";
		for(int i=0;i<n;i++){S1=S1+S.substring(l-n,l);}
		return S1;
	}
	public static void main(String[] args) {
		System.out.println(ret(args[0],Integer.parseInt(args[1])));
	}
}
