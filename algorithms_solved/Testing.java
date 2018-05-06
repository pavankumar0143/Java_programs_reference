import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class a{
	public void pr(int x){
		System.out.println(x);
	}
}
class b extends a{
	public void pr(int x){
		System.out.println(1);
	}
	public void print(double b){
		System.out.println(b);
	}
}


public class Testing {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		HashSet<Integer> hs=new HashSet<Integer>();
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		al.sort(new Comparator<Integer>()
								{
										public int compare(Integer o1, Integer o2) {
											// TODO Auto-generated method stub
											return o1.compareTo(o2);
										}
								});
		hs.add(9);
		for(Integer i:map.keySet()){
			System.out.println(map.get(i));
		}
		Set<Entry<Integer,String>> set=map.entrySet();
		List<Entry<Integer,String>> ls=new ArrayList<Entry<Integer,String>>(set);
		Collections.sort(ls,new Comparator<Map.Entry<Integer,String>>(){
				public int compare(Map.Entry<Integer,String> e1,Map.Entry<Integer,String> e2){
					return e1.getValue().compareTo(e2.getValue());
				}
		});
	}
	
}
