import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class largestPalindrome {

	
	 public static void maxnumber(String str) {
	    	int count=0,flag=0,single=0;
	        Map<Character, Integer> baseMap = new HashMap<Character, Integer>();  
	        char[] charArray = str.toCharArray();  
	        for (Character ch : charArray) {  
	            if (baseMap.containsKey(ch)) {  
	                baseMap.put(ch, baseMap.get(ch) + 1);  
	            } else {  
	                baseMap.put(ch, 1);  
	            }  
	        }  
	        Set<Character> keys = baseMap.keySet();  
	        for (Character ch : keys) {  
	            if ((baseMap.get(ch)%2==0)&&(baseMap.get(ch)>1)) {  
	                 count=count+baseMap.get(ch);
	            }  
	            else if((baseMap.get(ch)%2==1)&&(baseMap.get(ch)>1)){
	            	count=count+(baseMap.get(ch)-1);
	            	flag=1;
	            }
	            else{
	            	flag=0;
	            	single=1;
	            }
	            	
	            
	        }
	        if(flag==1){
	        	count++;
	        	System.out.println(count);
	        }
	        else {
	        	count=count+single;
	        	System.out.println(count);
	        }
	    }  
	 public static void main(String[] args) {
		maxnumber("Aabbcdefghijklmnopqrstuvwxyzz".toLowerCase());
	}
}
