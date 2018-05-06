package demo;

public class Reverse_words {
	public String rev(String s){
		char[]c =s.toCharArray();
		String s1="";
		for(int i=c.length-1;i>=0;i--){
			s1=s1+c[i];
		}
		return s1;
	}
	String revWord(String s){
		String []s1=s.split(" ");
		String res="";
		for(int i=0;i<s1.length;i++){
			res=res+rev(s1[i])+" ";
		}
	return rev(res).trim();
	}
public static void main(String[] args) {
	Reverse_words rw=new Reverse_words();
	String s=" All Things Bright And Beautiful";
	System.out.println(rw.revWord(s));
}
}
