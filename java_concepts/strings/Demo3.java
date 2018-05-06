//digits location to itrs power
public class Demo3 {
	public static void main(String[] args) {
		 int input1 = Integer.valueOf(args[0]);
	        int sum=0;
	            if(input1==0){
	                System.out.println(input1);
	            }
	            else if(input1>0){
	            	String s=String.valueOf(input1);
	                int c=s.length();
	                for(int i=0;i<s.length();i++){
	                    sum=sum+(int)Math.pow(Integer.valueOf(s.substring(i,i+1)),c);
	                    c--;
	                    System.out.println(sum);
	                 }
	            }
	            else
	            {
	                if(input1<0){
	                 input1=input1*(-1);
	                 String s=String.valueOf(input1);
	                 for(int i=0;i<s.length();i++){
		                    sum=sum+(int)Math.pow(Integer.valueOf(s.substring(i,i+1)),i+1);
	                 }
	                sum=sum*(-1);
	            }
	                }
	          System.out.println(sum);   
	           }
}


