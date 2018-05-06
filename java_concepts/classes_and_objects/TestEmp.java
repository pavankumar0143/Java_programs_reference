
public class TestEmp {
	public static void main(String[] args) {
		Employe emp=new Employe("pavan",3000.99,1997,"140004309");
		System.out.println("Name :"+emp.name+"\nSalary :"+emp.getSalary()+"\nYear of joining :"+emp.getYear()+"\nSocial SEC num :"+emp.getSocNum());
	}

}
