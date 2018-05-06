package set_13;

public class NoOfChar {
	static int findNoOfChar(int n){
		String s="";
		for(int i=1;i<=n;i++){
			s=s+i;
		}
		return s.trim().length();
	}
	public static void main(String[] args) {
		System.out.println(findNoOfChar(101));
	}
}
