
public class ReverseVowels {
	public static boolean isVowel(char c){
		return (c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' ||
	            c=='o' || c=='O' || c=='u' ||c=='U');
	}
	public static String revVowels(char arr[]){ 
		int l=0;
		int r=arr.length-1;
		while(l<r){
			if(!isVowel(arr[l])) {l++ ;continue;}
			if(!isVowel(arr[r])) {r--;continue;};
			char temp=arr[r];
			arr[r]=arr[l];
			arr[l]=temp;
			l++;
			r--;
		}
		return new String(arr);
	}
	public static void main(String[] args) {
		System.out.println(revVowels("Sandeep".toCharArray()));
	}
}
