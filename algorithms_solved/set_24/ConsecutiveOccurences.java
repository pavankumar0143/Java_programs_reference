package set_24;

import java.util.HashMap;

public class ConsecutiveOccurences {
	static HashMap<Character,Integer> findOccurences(String str){
		int slow=0;
		int fast=1;
		int count=1;
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
			while(slow<str.length() && fast<str.length()){
				if(str.charAt(slow)==str.charAt(fast)){
						count++;
						if(map.get(str.charAt(slow))!=null && count>map.get(str.charAt(slow))){
							map.put(str.charAt(slow), count);	
						}
						fast++;
					}
				else{
					count=1;
					map.put(str.charAt(fast), 1);
					slow=fast;
					fast++;
				}
		}
			return map;
	}
	
	static void printOccurrences(String s){
		HashMap<Character,Integer> map=findOccurences(s);
		for(Character c:map.keySet()){
			System.out.println(c+"-->"+map.get(c));
		}
	}
	public static void main(String[] args) {
		String s="abaaabcccccded";
		printOccurrences(s);
	}
}
