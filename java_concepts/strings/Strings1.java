
public class Strings1 {
	public static void main(String[] args) {
		String S="";
		for(int i=args[0].length();i>0;i--){
			S=S+args[0].substring(i-1,i);
		}
		if(args[0].equals(S))
			System.out.println("Pallindrome");
		else
			System.out.println("Not Pallindrome");
	}

}
