import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demoo {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List al=new ArrayList();
		String s[]={"1","2","3","4"};
		al= Arrays.asList(s);
	for(Object d:al)
	{
		System.out.println(d);
	}
		
	}

}
