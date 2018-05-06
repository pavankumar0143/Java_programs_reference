package set_13;

public class reverseStringKeepingSpecialcharecter {
	static char[] swap(char arr[],int l,int r){
		char temp=arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
		return arr;
	}
	static boolean check(char a){
		return ((a>='a' && a<='z') || (a>='A' && a<='Z') ||
				(a>='0' && a<='9')); 
	}
	static String rev(char str[]){
		int start=0,end=str.length-1;
		while(start<end){
			if(check(str[start]) && check(str[end])){
				str=swap(str,start,end);
				start++;
				end--;
			}
			else if(!check(str[start])){
				start++;
			}
			else
				end--;
		}
		return String.valueOf(str);
	}
	public static void main(String[] args) {
		String s="A man, in the boat says : I see 1-2-3 in the sky";
		
		char str[]=s.toCharArray();
		System.out.println(rev(str));
		System.out.println("y kse, ht ni3 21ee sIsy : a sta o-b-e ht nin amA");
	}
}
