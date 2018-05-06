import java.util.Iterator;
import java.util.TreeSet;

class COMparable implements Comparable{  
		int rollno; 
		String name;  
		int marks;  
		COMparable(int rollno,String name,int marks){ 
		this.rollno=rollno;  
		this.name=name;  
		this.marks=marks; 
		}
		public COMparable() {
			// TODO Auto-generated constructor stub
		}
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		public int compareTo(Object obj){ 
			COMparable com=(COMparable)obj;  
			if(marks==com.marks)  
			return 0; 
			else if(marks>com.marks)  
			return 1;  
			else 
			return -1;  
			}
	public static void main(String[] args) {
		TreeSet treeset=new TreeSet();
		COMparable cm =new COMparable();
		cm.setMarks(65);
		cm.setName("pavan");
		cm.setRollno(1);
		treeset.add(cm); 
		treeset.add(new COMparable(2,"Abhi",96));  
		treeset.add(new COMparable(3,"Sanjai",45));
		Iterator itr=treeset.iterator(); 
		while(itr.hasNext()){ 
		COMparable st=(COMparable)itr.next(); 
		System.out.println(st.rollno+":"+st.name+":"+st.marks);
	}

	}
}
	
