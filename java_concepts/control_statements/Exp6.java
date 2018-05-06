
public class Exp6 {
	public static void main(String [] args){
		if(args[0]=="Female"){
			if(Integer.parseInt(args[1])>=1 && Integer.parseInt(args[1])<=58)
				System.out.println("Interest == 8.2%");
			else
				System.out.println("Interest == 7.6%");
		}
		else {
			if(Integer.parseInt(args[1])>=1 && Integer.parseInt(args[1])<=60)
				System.out.println("Interest == 9.2%");
			else
				System.out.println("Interest == 8.3%");
		}
	}

}

