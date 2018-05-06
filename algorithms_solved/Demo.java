package demo;

import java.util.regex.Pattern;

public class Demo {
	int empno;
	double salary;
	String name;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.setEmpno(101);
		System.out.println(d.getEmpno());
		String ff="A2bc";
		String gg="Bac";
		int j=ff.compareToIgnoreCase(gg);
		boolean b=Pattern.matches("[a-zA-Z]+", ff);
		System.out.println(b+""+j);
		int a=11;
String s=new StringBuilder("hi").reverse().toString();

	}

}
