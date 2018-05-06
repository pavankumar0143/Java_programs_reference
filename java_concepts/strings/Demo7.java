
public class Demo7 {
public static void main(String[] args) {
	String S=args[0];
	String s[]=new String[3];
	int n=s.length;
	if (n%3==0)
	{
		s[0]=S.substring(0,n/3);
		s[1]=S.substring(n/3,S.length()-n/3);
		s[2]=S.substring(S.length()-n/3);
	}	
	for(String sk:s){
		System.out.println(sk);
	}
}
}
