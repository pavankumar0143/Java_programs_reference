import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHasSET {
public static void main(String[] args) {
	LinkedHashSet hs=new LinkedHashSet();
	hs.add("hi");
	hs.add("hii\"");
	hs.add(null);
	hs.add("hi");
	hs.add("hii2");
	hs.add("hii3");
	hs.add("pavan");
	hs.add(1);
	Iterator it=hs.iterator();
	while(it.hasNext()){
		
		System.out.println(it.next());
	}
}
}
