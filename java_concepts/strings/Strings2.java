
public class Strings2 {
public static void main(String[] args) {
	int n=args[0].length();
	
	if(args[0].substring(n-1,n).equalsIgnoreCase(args[1].substring(0,1))){
		System.out.println(args[0]+args[1].substring(1,args[1].length()));
	}
	else
		System.out.println(args[0]+args[1].substring(0, args[1].length()));

}
}
