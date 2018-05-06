import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ListInsert_and_get {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<String> Arr=new ArrayList<String>();
	ListIterator<String> itt=Arr.listIterator();
	for(int i=0;i<5;i++){
		Arr.add(sc.next());
	}
		Arr.set(2, "12");
	
	
}
}
