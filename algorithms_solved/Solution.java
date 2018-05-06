import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner in = new Scanner(System.in);
      String input1 = in.nextLine();
        String out="";char c;
      int input2 = Integer.parseInt(in.nextLine());
      int input3 = Integer.parseInt(in.nextLine());
        if(input2<0 && input3!=1 && input3!=2){
            System.out.println("INVALID DIRECTION");
        }
        else if((input2%26)<0){
           System.out.println("INVALID SHIFT");
       }
        else if(input3!=1 && input3!=2){
           System.out.println("INVALID DIRECTION");
       }
      else {
          for(int i=0;i<input1.length();i++){
              if(((int)input1.charAt(i)>=(int)'a' && (int)input1.charAt(i)<=(int)'z') || 
                 ((int)input1.charAt(i)>=(int)'A' && (int)input1.charAt(i)<=(int)'Z')){
                  if(input3==1){
                    c=(char)((int)input1.toLowerCase().charAt(i)+(input2%26));
                      if((int)c>=(int)'z'){
                          c=(char)(((int)c-(int)'z')+96);
                      }
                      if(input1.charAt(i)>=65 && input1.charAt(i)<=90)
                    	  out=out+Character.toString(c).toUpperCase();
                      else
                    	  out=out+Character.toString(c);
                    	  
                  }
                  else if (input3==2){
                      c=(char)((int)input1.toLowerCase().charAt(i)-(input2%26));
                      if((int)c<=(int)'a' ){
                          c=(char)((123-((int)'a'-(int)c)));
                      }
                      if(input1.charAt(i)>=65 && input1.charAt(i)<=90)
                    	  out=out+Character.toString(c).toUpperCase();
                      else
                        out=out+Character.toString(c);   
                  }
              }
            else{
                out=out+Character.toString(input1.charAt(i));
            }
      
          }          
      System.out.println(out);
    }
}
}
