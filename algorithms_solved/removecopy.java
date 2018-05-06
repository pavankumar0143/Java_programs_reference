
public class removecopy {
	public static void main(String[] args) {
		String s="malayalam";
		for(int i=0;i<s.length();i++){
			if(s.substring(i+1).contains(s.substring(i, i+1))){
				
				s=s.substring(0,i+1)+s.substring(i+1).replace(s.substring(i, i+1),"");
			}
		}
		System.out.println(s);
	}

}
