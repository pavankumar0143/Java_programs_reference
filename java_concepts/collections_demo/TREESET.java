import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class TREESET {
public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet<String>();
	ts.add("pavan");
	ts.add("kumar");
	ts.add("java");
	ts.add("Add");
	ts.add("add");
	ts.add("1");

	Iterator<String> it=ts.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	//Arrays.asList(ts);//convert array to list
}
}
