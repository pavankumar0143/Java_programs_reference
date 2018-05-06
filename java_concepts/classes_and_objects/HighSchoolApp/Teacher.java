package HighSchoolApp;

public class Teacher extends Person {
	double Salary;String subject;
	public Teacher(String name,int Age,double Salary,String subject){
		super(name,Age);
		this.Age=Age;
		this.name=name;
		this.subject=subject;
		this.Salary=Salary;
	}
	public double getSalary() {
		return Salary;
	}
	public String getSubject() {
		return subject;
	}
	

}
