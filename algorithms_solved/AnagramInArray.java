
public class AnagramInArray {
	public static boolean areAnagram(char str1[],char str2[]){
			if(str1.length!=str2.length){
				return false;
			}
			if(str1.length==0||str2.length==0) return false;
			int count1[]=new int[26];
			int count2[]=new int[26];
			for(int i=0;i<str1.length;i++){
				count1[str1[i]-'a']++;
				count2[str2[i]-'a']++;
			}
			for(int i=0;i<26;i++){
				if(count1[i]!=count2[i]){
					return false;
				}
			}
		return true;
	}
	
	public static void findPairs(String arr[]){
		boolean arr1[]=new boolean[arr.length];
		for(int i=0;i<arr.length;i++){
			if(!arr1[i])
				System.out.print(arr[i]);
			for(int j=i+1;j<arr.length;j++){
				if(areAnagram(arr[i].toCharArray(), arr[j].toCharArray())){
					System.out.print(" "+arr[j]);
					arr1[j]=true;
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		String s[]="bat code cat tab cab crazy act abt".split(" ");
		findPairs(s);
	}
}
