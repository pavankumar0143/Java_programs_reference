//NUMBER OF OCCURENCES
public class Demo8 {
	public static void main(String[] args) {
		String s="PauarKumar";
		for(int i=0;i<s.length();i++){
			int n=s.length()-s.replace(s.substring(i, i+1),"").length();
			System.out.println(s.substring(i, i+1)+" ->"+n);
		}
	}
}
