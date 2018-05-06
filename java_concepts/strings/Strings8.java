
public class Strings8 {
	public static String R(String s1,String s2,int n){
		String s="";
		for(int i=0;i<n;i++){
			s=s+s1+s2;
		}
		return s.substring(0, s.length()-1);
	}
	public static void main(String[] args) {
		System.out.println(R(args[0],args[1],Integer.parseInt(args[2])));
	}
}
