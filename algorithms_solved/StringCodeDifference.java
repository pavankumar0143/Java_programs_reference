import java.util.HashMap;

public class StringCodeDifference {
	static HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	public static void insert(){
		char ch='A';
		for(int i=1;i<27;i++){
			map.put(ch++, i);
		}
	}
	public static int alphaValue(char ch){
		return map.get(ch);
	}
	public static int genCode(String s){
		int start=0;
		int end=s.length()-1;
		int sum=0;
	
		while(start<end){
			sum=sum+(Math.abs(alphaValue(s.charAt(start))-alphaValue(s.charAt(end))));
			start++;
			end--;
		}
		if(s.length()%2==1){
			return sum+alphaValue((s.charAt(s.length()/2)));
		}
		
		return sum;
	}
	public static String genSumOut(String s){
		String[]s1=s.split(" ");
		String res="";
		for(int i=0;i<s1.length;i++){
			res=res+String.valueOf(genCode(s1[i]));
		}
		return res;
		}
	public static void main(String[] args) {
		insert();
		System.out.println(genSumOut("a b c d e f g h i j k l m".toUpperCase()));
		
		
	}
}
