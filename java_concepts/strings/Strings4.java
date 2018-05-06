
public class Strings4 {
	public static String half(String s,int n){
		
		if (n%2==0){
			return s.substring(0,n/2);
		}
		else
			return "";
	}
	public static void main(String[] args) {
		System.out.println(half(args[0],args[0].length()));
	}
}
