
public class Demo2 {
	public static void main(String[] args) {
		String s="heloo";
		char c[]=new char[s.length()]; 
		for(int i=0;i<s.length();i++)
		{
			{if(s.charAt(i)=='o'){
				c[i]='a';
			}
			else
				c[i]=s.charAt(i);
				
			}
		}
		for(int i=0;i<c.length;i++)
			 System.out.print((c[i]));
		
		
	}
}
