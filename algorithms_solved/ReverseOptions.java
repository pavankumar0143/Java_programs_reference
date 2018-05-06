import java.util.Scanner;

public class ReverseOptions
{
    
     
    private static Scanner sc;

	public static void main(String[] args) 
    {
    	
    	sc = new Scanner(System.in);
    	System.out.println("Menu\n1.Reverse String\n2.Reverse String preserve case \n3.Reverse String with cases");
    	int opt=sc.nextInt();
    	switch(opt){
    	
    	case 1:
    	 String rs = "";
         
         for (int i = 0; i < args.length; i++) 
         {
 
              
             String rw = "";
              
             for (int j = args[i].length()-1; j >= 0; j--) 
             {
                 rw = rw + args[i].charAt(j);
             }
              
             	rs= rs + rw + " ";
         }
          System.out.println(rs);
         break;
    	case 2:
    		String rp = "";
            
            for (int i = 0; i < args.length; i++) 
            {
    
                 
                String rw = "";
                 
                for (int j = args[i].length()-1; j >= 0; j--) 
                {
                    rw = rw + args[i].charAt(j);
                }
                 
                	rp= rp + rw + " ";
            }
             //System.out.println(rs);
            String s[]=rp.split(" ");
            for(int i=0;i<s.length;i++){
       	
           	 for(int j=0;j<s[i].length();j++){
       		
           		 if(args[i].charAt(j)<=90 && args[i].charAt(j)>=65){
       			
           			 System.out.print(Character.toUpperCase(s[i].charAt(j)));
           		 }
           		 else
           		 {
           			 System.out.print(Character.toLowerCase(s[i].charAt(j)));
           		 }
           	 }
           	 	System.out.print(" ");
            }
            break;
    		
         
    	case 3:
    	   	 String rk = "";
             
             for (int i = 0; i < args.length; i++) 
             {
     
                  
                 String rw = "";
                  
                 for (int j = args[i].length()-1; j >= 0; j--) 
                 {
                     rw = rw + args[i].charAt(j);
                 }
                  
                 	rk= rk + rw + " ";
             }
              //System.out.println(rs);
             String s1[]=rk.split(" ");
             for(int i=0;i<s1.length;i++){
        	
            	 for(int j=0;j<s1[i].length();j++){
        		
            		 if(s1[i].charAt(j)<=90 && s1[i].charAt(j)>=65){
        			
            			 System.out.print(Character.toLowerCase(s1[i].charAt(j)));
            		 }
            		 else
            		 {
            			 System.out.print(Character.toUpperCase(s1[i].charAt(j)));
            		 }
            	 }
            	 	System.out.print(" ");
             }
             break;
            default:
            	System.out.println("please enter correct option");
    	}
             
        
        
         
    }
}