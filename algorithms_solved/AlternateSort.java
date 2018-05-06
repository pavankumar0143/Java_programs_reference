import java.util.*;

public class AlternateSort {
public static ArrayList<Integer> altSort(List<Integer> al,int n){
	int r=0;
	int l=n-1;
	ArrayList<Integer> temp=new ArrayList<Integer>();
	boolean toggle=true;
	while(r<l){
		if(toggle){
			temp.add(al.get(l));
			l--;
		}
		else{
			temp.add(al.get(r));
			r++;
		}
		toggle=!toggle;
	}
		temp.add(al.get(r));
		
	
	return temp;
}
public static void main(String[] args) {
	Integer arr[]={1, 2, 3, 4, 5, 6, 7, 8,9,10};
	
	List<Integer> ar=new ArrayList<Integer>(Arrays.asList(arr));
	
	System.out.println(altSort(ar,ar.size()));
}
}
