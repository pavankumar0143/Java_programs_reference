
public class Strings11 {
	public static String com(String a,String b,int p){
		String Sk="";
		for(int i=0;i<p;i++){Sk=Sk+a.substring(i,i+1)+b.substring(i,i+1);}
	return Sk;
	}
	public static String ret(String a,String b) {
		int a1=a.length(),a2=b.length();
		String s="";
		if(a1==a2){
			s=com(a,b,a1);
		}
		else if(a1>a2){
			s=com(b,a,a2);
			s=s+" "+a.substring(a1-(a1-a2),a1);
		}
		else{
			s=com(a,b,a1);
			s=s+" "+b.substring(a2-(a2-a1),a2);
			}
		return s;
	}
	public static void main(String[] args) {
		System.out.println(ret(args[0],args[1]));
	}
}
