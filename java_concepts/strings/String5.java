
public class String5 {
	public static String middle(String S,int n){
		if(n>2){
			return S.substring(1,n-1);
		}
		else
			return "";
	}
	public static void main(String[] args) {
		System.out.println(middle(args[0],args[0].length()));
	}
}
