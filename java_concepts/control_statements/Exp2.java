
public class Exp2 {

	public static void main(String[] args) {
		if(args.length>0){
			  int num=Integer.parseInt(args[0]);
			  if(num>=0){
				  if (num==0){
					  System.out.println(num+" is Nither odd nor even");
				}
				  else if (num%2==0){
					  System.out.println(num+" is Even ");
				  
			  }
				  else {
				  System.out.println(num+" is odd");
			  }
			}
			  else{System.out.println("Enter positive number ");}
			  
			
		}
		else {
			System.out.println("Please pass arguments ");
		}

	}

}
