
public class Exp15 {
	public static void main(String[] args){
		int i,len=args[0].length(),sum=0;
		int c;
		for(i=0;i<len;i++){
			c=(int)(args[0].charAt(i))-48;
			sum=sum+c;
		}
	System.out.println(sum);
		
	}
	

}
