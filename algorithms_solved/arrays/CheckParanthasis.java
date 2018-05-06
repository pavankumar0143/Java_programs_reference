package arrays;

import java.util.Stack;

public class CheckParanthasis {
	int arr[]=new int[3];
	boolean check(String str){
		for(int i=0;i<str.length();i++){
			switch(str.charAt(i)){
				case '{': arr[0]=arr[0]+1;break;
				case '}': arr[0]=arr[0]-1;break;
				case '[': arr[1]=arr[1]+1;break;
				case ']': arr[1]=arr[1]-1;break;
				case '(': arr[2]=arr[2]+1;break;
				case ')': arr[2]=arr[2]-1;break;
			}
		}
		int count=0;
		for(int i=0;i<3;i++){
			if(arr[i]==0)count++;
		}
		if(count==3 ) return true;
	return false;
	}
	public static void main(String[] args) {
		String s="{[}]";
		Stack<Integer> n=new Stack<Integer>();
		
		CheckParanthasis c=new CheckParanthasis();
		System.out.println(c.check(s));
		
	}
}
