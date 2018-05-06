public class Strings9 {
	public static String S(String str){
		String S="";
		int n=str.indexOf('*');
		int l=str.lastIndexOf('*');
		S=str.substring(0, n-1)+str.substring(l+2);
		return S;
	}
	public static void main(String[] args) {
		System.out.println(S(args[0]));
	}
}
