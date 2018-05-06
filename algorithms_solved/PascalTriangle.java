import java.util.ArrayList;

public class PascalTriangle {
	
		public static ArrayList<ArrayList<Integer>> generate(int n) {
		    ArrayList<ArrayList<Integer>> col= new ArrayList<ArrayList<Integer>>();
		    ArrayList<Integer> row=null;
		     for (int line = 1; line <= n; line++)
	                  {
	                    int C = 1;
	                    row= new ArrayList<Integer>();
	                for (int i = 1; i <= line; i++)  
	                     {
	                            row.add(C);
	                            C = C * (line - i) / i;  
	                        }
	                        col.add(row);
		}
		return col;
	}
	public static void main(String[] args) {
		for(ArrayList<Integer> al:generate(10)){
			System.out.println(al);
		}
	}
}
