import java.util.HashMap;

 
public class PrintcharsAccordingTheirFrequency {
	
	
	public static void sortChar(String s){
		int max=0;
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
				max=Math.max(max,map.get(s.charAt(i)));
			}
			else {
				map.put(s.charAt(i), 1);
				}
			}
		
		char[][] a=new char[max+1][52];
		
		for(Character c:map.keySet()){
				if(c>='a'&& c<='z')
					a[map.get(c)][c-'a']=c;
				else
					a[map.get(c)][26+(c-'A')]=c;
		}
		
		for(int i=a.length-1;i>=0;i--){
			for(int j=0;j<a[i].length;j++){
				for(int k=0;k<i;k++){
					if(a[i][j]!='\0')
						System.out.print(a[i][j]);
				}
			}
		}
		}
	
	
	public static void main(String[] args) {
		sortChar("PavanKumar");
	}
}
