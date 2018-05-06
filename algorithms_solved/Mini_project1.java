public class Mini_project1 {
	public static String data(String s){
		String S[]={"1001 Ashish 01/04/2009 e R&D 20000 8000 3000","1002 Sushma 23/08/2012 c PM 30000 12000 9000",
					"1003 Rahul 12/11/2008 k Acct 10000 8000 1000","1004 Chahat 29/01/2013 r FrontDesk 12000 6000 2000",
					"1005 Ranjan 16/07/2005 m Engg 50000 20000 20000","1006 Suman 1/1/2000 e Manufacturing 23000 9000 4400",
					"1007 Tanmay 12/06/2006 c PM 29000 12000 10000"};
		int count=-1;
			for (int i=0;i<S.length;i++){
				if(S[i].startsWith(s)){
					count=i;
					break;
				}
			}
			if(count==-1)
				return "No";
			else
				return S[count];
		}
	public static int salary(String a,String b,String c,int d){
		int a1=Integer.valueOf(a);
		int a2=Integer.valueOf(b);
		int a3=Integer.valueOf(c);
		int sum_1=a1+a2+d-a3;
		return sum_1;
	}
	public static void main(String[] args){
		String S=data(args[0]);
		String s[]=new String[8];
		if (S.equals("No")){
			System.out.println("There is no employee with id: "+args[0]);
		}
		else{
			s=S.split(" ");
			String s_1="";
		switch(s[3].charAt(0)){
			case 'e':
				s_1="Engineer";
				System.out.println("Emp_No	   Emp_Name	   Department      Designation 	    Salary ");
				//System.out.println(s[0]+s[1]+s[4]+"Engineer"+salary(s[5],s[6],s[7],20000));
				System.out.printf( "%-10s %-15s %-15s %-11s %10s", s[0],s[1],s[4],s_1,String.valueOf(salary(s[5],s[6],s[7],20000)));
				break;
			case 'c':
				s_1="Consultant";
				System.out.println("Emp_No	   Emp_Name	   Department      Designation 	    Salary ");
				System.out.printf( "%-10s %-15s %-15s %-11s %10s", s[0],s[1],s[4],s_1,String.valueOf(salary(s[5],s[6],s[7],32000)));
				break;
			case 'k':
				s_1="Clerk";
				System.out.println("Emp_No	   Emp_Name	   Department      Designation 	    Salary ");
				System.out.printf( "%-10s %-15s %-15s %-11s %10s", s[0],s[1],s[4],s_1,String.valueOf(salary(s[5],s[6],s[7],12000)));
				break;
			case 'r':
				s_1="Receptionist";
				System.out.println("Emp_No	   Emp_Name	   Department      Designation 	    Salary ");
				System.out.printf( "%-10s %-15s %-15s %-11s %10s", s[0],s[1],s[4],s_1,String.valueOf(salary(s[5],s[6],s[7],15000)));
				break;
			case 'm':
				s_1="Manager";
				System.out.println("Emp_No	   Emp_Name	   Department      Designation 	    Salary ");
				System.out.printf( "%-10s %-15s %-15s %-11s %10s", s[0],s[1],s[4],s_1,String.valueOf(salary(s[5],s[6],s[7],40000)));
				break;
			default:
				System.out.println("Designation not present");
			}	
		}
   }
}
