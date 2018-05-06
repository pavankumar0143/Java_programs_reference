

//find letters staring with "F" and enging with e*/
public class Demo10 {
	public static String split(String s) {
		String S[]=s.split(":");
		String p="";
		for(int i=0;i<S.length;i++){
			if(S[i].startsWith("f") && S[i].endsWith("e") && S[i].length()==4){
				p=p+" "+S[i];
			}
		}
		return p;
	}
public static void main(String[] args) {
	String s="file:five:fine:four:friend:feaver:fix:figure";
	System.out.println(split(s));
}
}
