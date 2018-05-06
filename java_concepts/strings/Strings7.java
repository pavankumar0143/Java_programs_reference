
public class Strings7 {
	public static String withoutX(String str) {
		  int n=str.length();
		  if(n>=2 &&str.substring(0,1).equals("x") && str.substring(n-1,n).equals("x"))
		    return str.substring(1,n-1);
		  else if(n>=1 && str.substring(0,1).equals("x"))
		    return str.substring(1,n);
		  else if(n>=1 && str.substring(n-1,n).equals("x"))
		    return str.substring(0,n-1);
		  else if(n<=2 || n>2)
		    return str;
		  else 
		    return "";
		}
	public static void main(String[] args) {
		System.out.println(withoutX(args[0]));
	}
}
