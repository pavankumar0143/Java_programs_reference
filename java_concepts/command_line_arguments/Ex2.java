import java.util.*;
public class Ex2{
	 static public void  main(String[] args)
	{   int arr[]=new int[args.length];
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
			sum=sum+arr[i];
			}
			
	System.out.println("The sum of "+args[0]+" and "+args[1]+" is "+sum);
    }
}
