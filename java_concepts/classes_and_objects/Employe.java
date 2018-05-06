
public class Employe extends Person{
	private double Salary;
	private int year;
	private String SocNum;
	public Employe(String name,double Salary,int year,String SocNum){
		this.Salary=Salary;
		this.name=name;
		this.year=year;
		this.SocNum=SocNum;
	}
	public double getSalary() {
		return Salary;
	}
	public int getYear() {
		return year;
	}
	public String getSocNum() {
		return SocNum;
	}
	
}
