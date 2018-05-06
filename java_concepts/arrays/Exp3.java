

public class Exp3 {

	public static void main(String[] args) {
		int a[]={27,39,32,7,1,4,9,2,49,27,2,8};
		int i;
		for (i=0; i< a.length;i++)
	      {
	           if ( a[i]==Integer.parseInt(args[0]) ); 
	           {
	        	     System.out.println(i);
	                 break;
	           }
	      }
		if(i==a.length)
		{
		System.out.println("-1");
		}
		
	}
}
