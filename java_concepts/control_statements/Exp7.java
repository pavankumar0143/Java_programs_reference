
public class Exp7 {

	public static void main(String [] args){
		char p;
		char c= args[0].charAt(0);
		if(((int)c>= 65)&&((int)c<= 90)){
			p=Character.toLowerCase(c);
			System.out.println(args[0]+"->"+p);
		}
		else{
			p=Character.toUpperCase(c);
			System.out.println(args[0]+"->"+p);
		}
		
	}

}
