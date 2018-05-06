
public class Demo {
	public static void main(String[] args) {
	String s=new String("weloo");
	String s1=("Wipro");
	String s3=s+s1;
	System.out.println(s3);
	char c=s3.charAt(4);
     int n=s1.compareTo("");//if empty string is compared with null string it will return length of string
     boolean i=s3.equals(s);
     System.out.println("Campare="+n+"     "+c+"     "+i );
     String s4=s3.substring(3, 5);
     System.out.println(s4+" ");
     System.out.println(s==s1);
     int b=s3.length()-s3.replace("o","").length();
     System.out.println(b);
     System.out.println(s3.startsWith("h"));
     String s5="this is a demo class of wipro";
     System.out.println(s5.indexOf('a',s5.indexOf('a')+1));
     
 }
}
