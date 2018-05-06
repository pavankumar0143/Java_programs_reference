
public class Exp1 {

	public static void main(String[] args) {
		if(args.length>0){
		  int num=Integer.parseInt(args[0]);
		  if (num>0){
			  System.out.println(num+" is positive number");
			}
		  else if (num==0){
			  System.out.println(num+" is neitehr positive nor negative");
			  
		  }
		  else {
			  System.out.println(num+" is negative number");
		  }
		}
		else {
			System.out.println("Please pass arguments ");
		}
		

	}

}
