
public class Exp5 {
public static void main(String[] args) {
	if(args.length>=1){
	if((int)args[0].charAt(0)>=48 && (int)args[0].charAt(0)<=58 ){
		System.out.println("digit");
	}
	else if((int)args[0].charAt(0)>64 && (int)args[0].charAt(0)<91 || (int)args[0].charAt(0)>96 && (int)args[0].charAt(0)<=122)
	{System.out.println("Alphabet");
		
	}
	else{
		System.out.println("Special charecter");
	}
	}
	else{
		System.out.println("Please Enter arguments or Enter only one argument ");	
		}
}
}
