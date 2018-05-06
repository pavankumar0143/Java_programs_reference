
public class ThreeEncodingWords {
	public static String[] Split(String S){
		int n=S.length();
		int n1=n/3;
		String s[]=new String[3];
		if(n%3==1||n%3==0){
				s[0]=S.substring(0,n1);
				s[1]=S.substring(n1,n-n1);
				s[2]=S.substring(n-n1,n);
			}
		else {
				s[0]=S.substring(0,n1+1);
				s[1]=S.substring(n1+1,n-n1-1);
				s[2]=S.substring(n-n1-1);
			}
		return s;
	}
	public static String[] Combine(String S1[],String S2[],String S3[]){
		String S_1[]=new String[3];
		S_1[0]=S1[0]+S2[1]+S3[2];
		S_1[1]=S1[1]+S2[2]+S3[0];
		S_1[2]=S1[2]+S2[0]+S3[1];
		return S_1;
	}
	public static String Convert(String k){
		String K="";
		for(int i=0;i<k.length();i++){
			if(k.charAt(i)<=90 && k.charAt(i)>=65){
				K=K+Character.toLowerCase(k.charAt(i));
			}
			else
				K=K+Character.toUpperCase(k.charAt(i));
		}	
		return K;
	}
	public static void main(String[] args) {
		String s1[]=Split(args[0]);
		String s2[]=Split(args[1]);
		String s3[]=Split(args[2]);
		String S_com[]=Combine(s1,s2,s3);
		System.out.println(S_com[0]+"\n"+S_com[1]+"\n"+Convert(S_com[2]));
		}
}

