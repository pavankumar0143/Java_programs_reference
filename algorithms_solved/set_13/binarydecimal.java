package set_13;

import java.util.HashMap;
import java.util.HashSet;

public class binarydecimal {
	static HashSet<String> genbinaryset(long start,long end){
		HashSet<String> set=new HashSet<String>();
			for(Long i=start;i<end;i++){
				set.add(Long.toBinaryString(i));
			}
		return set;
	}
	static HashMap<Integer,HashSet<String>> gencombinations(int range){
			HashMap<Integer,HashSet<String>> map=new HashMap<Integer,HashSet<String>>();
			long start=1,end=9;
			int i=0;
			while(end<range){
				map.put(i,genbinaryset(start,end));
				start=end+1;
				end=(long) Math.pow((end+1), 2);
				i++;
			}
			return map;
	}
	public static void main(String[] args) {
		
	}
}
