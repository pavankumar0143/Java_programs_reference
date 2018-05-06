import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TicTac {
	//to check wether string contains <tic> and <tac>
		public static boolean check(String s){
			if(!(s.contains("<tic>") && s.contains("<tac>"))) return false;
			if(s.substring(s.indexOf('<'),s.indexOf('>')+1).equals("<tic>") && s.substring(s.lastIndexOf('<'),s.lastIndexOf('>')+1).equals("<tac>")){
				return true;
			}
			return false;
		}
		
	//to return no:of words in the string	
		public static int countWords(String s){
				
			return s.trim().split(" ").length;
		}
		
	//to return no:of letter in the String and returns count in the descending order
		
		public static String countLetters(String s){
			String s1=s.replace(" ", "");
			String result="";
			TreeMap<Character,Integer> Tm=new TreeMap<Character,Integer>();
			for(int i=0;i<s1.length();i++){
				if(Tm.containsKey(s1.charAt(i))){
					Tm.put(s1.charAt(i),Tm.get(s1.charAt(i))+1);
				}
				else{
					Tm.put(s1.charAt(i), 1);
				}
			}
			Set<Entry<Character,Integer>> set=Tm.entrySet();
			List<Entry<Character,Integer>>	list=new ArrayList<Entry<Character,Integer>>(set);	
				 
			//to sort desencding order this is little bit confusing try to use internet to understand
			Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>()
				{
					public int compare(Map.Entry<Character,Integer> e1,Map.Entry<Character,Integer> e2)
						{
							return (e2.getValue().compareTo(e1.getValue()));
						}
				}
					);
			for(Map.Entry<Character,Integer> map:list){
				result=result+map.getValue();
			}
			
			return result.trim();
		}
		
		
		// a function to genarate the requried output
		public static String genOut(String s){
			String res="";
			if(check(s)){
				res=s.substring(s.indexOf('>')+1, s.lastIndexOf('<'));
				System.out.println(res);
				if(res.length()==0){
					return "0";
				}
				else
					return countWords(res)+countLetters(res);
			}
			return "0";
		}
		
		
		public static void main(String[] args) {
			String s="<Tic> 9799 apple <Tac>".toLowerCase();
				System.out.println(genOut(s));
		}
}
