import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HASHmap {
public static void main(String[] args) {
	HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	 hm.put('a', 1);
	 hm.put('a', 2);
	 Set s=hm.keySet();
	 Iterator itt=s.iterator();
	 int a=65;
	 while(itt.hasNext()){
		 Character key=(Character)itt.next();
		 System.out.println(key+"::"+hm.get(key));
		 hm.put((char)a++, 3);
		 
	 }
	 System.out.println("_______________________");
	 System.out.println("                       ");
	  
	Set<Entry<Character,Integer>> s1=hm.entrySet();
	Iterator<Entry<Character,Integer>> itt1=s1.iterator();
	while(itt1.hasNext()){
	Map.Entry<Character,Integer> mm =(Entry<Character,Integer>)itt1.next();
		System.out.println(mm.getValue()+" ::"+mm.getKey());
	}//
	for(Character map:hm.keySet()){
		System.out.println(map+":"+hm.get(map));
	}
  }
}
