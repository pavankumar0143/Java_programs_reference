
public class Exam_question {
 public static int sum(String s){
	 int i,len=s.length(),sum=0;
		int c;
	 if(len==3){
		for(i=0;i<len;i++){
			c=(int)(s.charAt(i))-48;
			sum=sum+c;
		}
		if(sum>9){
			int sum1=0;
			int n=sum;
			while(n>0){
				sum1=sum1+n%10;
				n=n/10;
			}
			return sum1;
		}
		else
			return sum;
	 }
	 return(-1);
	}
 
 public static String Spl(int n,String []p){
	 return p[n];
	 }

 
 public static String ln(String k){
	 int n=k.length();
	 return k.substring(n-1,n);
 }
 
 public static String md(String p){
	 return p.substring(1,2);
 }
 
 public static void main(String args[]){
	 String S1="";
	 String S2="";
	 int count=0;
	 for(int i=0;i<args.length;i++){
		 if((int)args[i].charAt(0)>58){
			 S1=S1+" "+args[i];
			 count=i;
		 }
		 else{
			 S1=S1.substring(0, S1.length());
			 break;
		 }
	 }
	 S2=args[count+1];
	 String S3[]={ ")","!","@","#","$","%","^","&","*","(" };
	 System.out.print(sum(S2)+Spl(sum(S2),S3)+ln(S1)+md(S2));
 }
 }