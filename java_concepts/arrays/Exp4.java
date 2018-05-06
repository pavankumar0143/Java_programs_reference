
public class Exp4 {
	public static void main(String[] args) {
		int s[]=new int[256];
		for(int i=0;i<256;i++){
			s[i]=i;
		}
		for(int a:s){
			System.out.println(a+"->"+(char)a+" ");
		}
	}
}
