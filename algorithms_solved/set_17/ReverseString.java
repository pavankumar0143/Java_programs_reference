package set_17;

public class ReverseString {
	static String res="";
	static String res1="";
	static int i;
	
	public static String reverse(String s,int n){
		if(n<=0) return res;
		else{
			res=res+s.charAt(n-1);
			reverse(s,n-1);
		}
		return res;
	}
	
	public static String reverseWord(String s[],int n){
		if(n==s.length) return reverse(res1,res1.length());
		if(n<s.length){
			res1=res1+" "+reverse(s[n],s[n].length());
			res="";
		}
		return reverseWord(s,n+1);
		
	
	}
	public static void main(String[] args) {
		String s="Pavan kumar reddy";
		System.out.println(
				reverseWord(s.split(" "),0));
	}
}
