package set_17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

public class Word_Wrapping {
	public static TreeMap<Integer,ArrayList<String>> genNum(String [] s,String c){
		TreeMap<Integer,ArrayList<String>> map=new TreeMap<Integer,ArrayList<String>>();
		ArrayList<String> al;
		for(int i=0;i<s.length;i++){
			int l=s[i].length()-s[i].replaceAll(c,"").length();
			if(l==0){
				l=s[i].length();
			}
			else if(l>=1){
				l=s[i].length()-l;
			}
			if(map.containsKey(l)){
				al=map.get(l);
				al.add(s[i]);
				map.put(l,al);
			}
			else
				al=new ArrayList<String>();
				al.add(s[i]);
				map.put(l,al);
		}
		for(Integer i:map.keySet()){
			System.out.println(i+" "+map.get(i));
		}
		return map;
	}
	
	public static void genWord(String [] s,String c,int num){
		TreeMap<Integer,ArrayList<String>> map=genNum(s,c);
		for(Integer p:map.descendingKeySet()){
			int req=num-p;
		Iterator<String> i=map.get(p).iterator();
		Iterator<String> k=map.get(req).iterator();
		String s1=i.next();
		String s2=k.next();
		if(k==null|| i==null|| s1.equals(s2)) continue;
		
		else if(s1.equals(s2)){
			req=map.ceilingKey(req);
			k=map.get(req).iterator();
			s2=k.next();
			if(s2!=null){
				System.out.println(s1+" "+s2);
				i.remove();
				k.remove();
			}
		}
		else {System.out.println(s1+" "+s2);
		i.remove();
		k.remove();
}
		}
	}
	public static void main(String[] args) {
		String[] s={"Zoho", "Eating", "Watching", "Pogo"
                ,"Loving", "Mango"};
		String c="o";
		int i=10;
		genWord(s,c,i);
	}
}
