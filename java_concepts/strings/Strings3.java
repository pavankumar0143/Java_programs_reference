
public class Strings3 {
	public static String copy(String k,int n){
		String S="";
		if (n>2){
		for(int i=0;i<n;i++){
			S=S+k.substring(0,2);
		}
		}
		else if(n>1 && n<=2){
			for(int i=0;i<n;i++){
				S=S+k;
			}
		}
		else
			S="";
		return S;
	}
	public static void main(String[] args) {
		System.out.println(copy(args[0],args[0].length()));
	}
}
