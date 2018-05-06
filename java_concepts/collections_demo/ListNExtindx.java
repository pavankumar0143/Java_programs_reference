import java.util.*;
import java.util.ListIterator;

public class ListNExtindx {

		public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		//Add elements to ArrayList object
					aList.add("1");
					aList.add(2);
					aList.add('3');
		ListIterator listIterator = aList.listIterator();
		System.out.println("Previous Index is : " + listIterator.previousIndex());   
		System.out.println("Next Index is : " + listIterator.nextIndex());
		//advance current position by one using next method
		listIterator.next();
		System.out.println("After increasing current position by one element : ");
		System.out.println("Previous Index is : " + listIterator.previousIndex());   
		System.out.println("Next Index is : " + listIterator.nextIndex());
		
			}
		}

