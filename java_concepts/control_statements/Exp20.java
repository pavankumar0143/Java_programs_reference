import java.util.*;
public class Exp20 {
	private static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
		int a,b,op;
		String rsp;
		do
		{
			System.out.println("Options: \n1.Add\n2.Sub");
			op=sc.nextInt();
			System.out.println("Enter two numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			switch(op)
			{
				case 1:System.out.println(a+b);break;
				case 2:System.out.println(a-b);break;
			}
			System.out.println("Do u want to contine");
			rsp=sc.next();
		}
		while(rsp.equalsIgnoreCase("y"));
	}
}