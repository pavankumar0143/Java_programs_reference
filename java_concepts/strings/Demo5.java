
public class Demo5 {
	public static void main(String[] s) {
		  String R="";
		  String n="pavan";
		  n=new StringBuilder(n).reverse().toString();
		    for(int i=0;i<s.length;i++){
		      if(s[i].equals("is")){
		        s[i]=s[i]+" not";
		      }
		    }
		    for(int i=0;i<s.length;i++){
		      R=R+" "+s[i];
		    }
		    String si[]=R.split(" ");
		    System.out.println(si[4]);
	}

}
