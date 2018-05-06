package coll;

import java.util.ArrayList;
import java.util.Iterator;

public class Numbers {
	static ArrayList<Integer> al=new ArrayList<Integer>();
	ArrayList<Integer> saveEvenNumbers(int n){
		for(int i=2;i<=n;i+=2){
			al.add(i);
		}
		return al;
	}
	ArrayList<Integer> printEvenNumbers(){
		ArrayList<Integer> al1=new ArrayList<Integer>();
		Iterator<Integer> it=al.iterator();
		while(it.hasNext()){
			al1.add((2*(int)it.next()));
		}
		return al1;
	}
	Integer printEvenNumbers1(int n){
		int i=0;
		Iterator<Integer> it=al.iterator();
		while(it.hasNext()){
			if((int)it.next()==n){
				i=n;
			}
		}
		if(i!=0){
			return i;
		}
		else return 0;
	}
	public static void main(String[] args) {
		Numbers nm=new Numbers();
		System.out.println(nm.saveEvenNumbers(10));
		System.out.println(nm.printEvenNumbers());
		System.out.println(nm.printEvenNumbers1(4));
	}
}
