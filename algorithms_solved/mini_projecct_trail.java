
public class mini_projecct_trail {
	
	    public static void main(String[] args) {
	         String emp[][]=new String[][]{{"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},{"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},{"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},{"1004","Chahat","29/01/2013","r","FrontDesk","12000","6000","2000"},{"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},{"1006","Suman","1/1/2000","e","Manufacturing","23000","9000","4400"},{"1007","Tanmay","12/06/2016","c","PM","29000","12000","10000"}};
	      int q=Integer.parseInt(args[0]);
	      int p=0;
	      String id[]=new String[10]; 
	      if(q<1008 && q>1000){
	      for(int i=1001;i<1008;i++)
	      {
	      p=q-1001;
	      }
	       for(int i=0;i<7;i++)
		{
			for(int j=0;j<8;j++)
			{	
	                    if(i==p){
			
	                  id[j]=emp[i][j];
	                    }
	                    }
			
		}
	      
	    String d[][]=new String[][]{{"e" ,"Engineer","20000"},{"c", "Consultant", "32000"},{"k"," Clerk", "12000"},{ "r"," Receptionist","15000"},{"m", "Manager", "40000"}};
	  String de[]=new String[10]; 
	    for(int i=0;i<5;i++)
		{ 
	               
			for(int j=0;j<3;j++)
			{	
	               if(id[3].equals(d[i][j])){
			for(int k=0;k<3;k++)
	                   de[k]=d[i][k];
	               }
	                    }
	                    
		}
	    int sal=Integer.parseInt(id[5])+Integer.parseInt(id[6])-Integer.parseInt(id[7])+Integer.parseInt(de[2]);
	   System.out.println("Emp No.   Emp Name       Department     Designation    Salary ");
	    System.out.printf("%-10s%-15s%-15s%-15s%5d\n",id[0],id[1],id[4],de[1],sal);
	}
	  else
		System.out.println("There is no employee with empid : "+q);           
	    int k =Integer.parseInt("1005");
	    System.out.println(k);
	    }
	    
	}


