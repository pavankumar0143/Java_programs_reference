import java.util.*;
public class Sorting {
public static void main(String[] args) {
	int a[]={3,4,5,6,7,7,1,2,2,3,4,7,8};
	Arrays.sort(a);
	int n=a.length;
	for(int i=0;i<a.length;i++){
		if(i+1<a.length){
		if(a[i]==a[i+1]){
			a[i]=a[i+1];
			n--;
		}
		else {
			if(a[i]==a[i+1]){
				a[i]=a[i+i];
				n--;
			}
		}
	 }
	}
	for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
}
}
