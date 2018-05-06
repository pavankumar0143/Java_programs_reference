
public class Exp13 {

	public static void main(String [] args){
		int c;
		for(int n=10;n<99;n++){
			c=0;
			for(int i=2;i<n;i++){
				if(n%i==0)
					c++;
		}
		if(c == 0)
			System.out.println(n+" ");
		
	 }
	}

}

