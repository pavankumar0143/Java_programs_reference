
public class JumbelledWords {
	public static String change(String s,int i,int a){
		String str="";
		int j=0;int k=0;
			if(s.length()%2==0 && a==1){
				k=0;}
			else{
				k=i;
			}
		for(j=k;j<s.length();j+=2)
			str=str+s.substring(j,j+1);
		return str;
	}

	public static String jumble(String s,int a){
		String []S=s.split(" ");
		String s1="";
		for(int i=0;i<S.length;i++){
				if(a==1){
					s1=s1+change(S[i],0,a);
					s1=s1+change(new StringBuilder(S[i]).reverse().toString(),1,a);
					if(i<S.length-1)
						s1=s1+" ";
				}
				else if(a==2){
					s1=s1+change(S[i],0,a);
					s1=s1+change(S[i],1,a);
					if(i<S.length-1)
						s1=s1+" ";
				}
		}
		
		return s1;
	}
	
}
