package set_13;

public class binarydecimalAnothermodel {
	static String getbinary(int n){
		String s="";
		while(n>0){
			if(n%10>=1)
				s=s+1;
			else
				s=s+0;
			n=n/10;
		}
		return new StringBuilder(s.trim()).reverse().toString();
	}
	static String genOutput(int n){
		String s="";
		while(n>0){
			String t=getbinary(n);
			n=n-Integer.parseInt(t);
			s=s+" "+t;
		}
		return s.trim();
	}
	public static void main(String[] args) {
		System.out.println(genOutput(1));
	}
}
