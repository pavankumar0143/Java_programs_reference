package HighSchoolApp;

import java.util.Scanner;

public class TestApp {
public static void main(String[] args) {
	Teacher t=new Teacher("Pavan",30,4500.99,"Computer science");
	CollageStudent cs=new CollageStudent("pavan Kumar",20,3,"ECE");
	System.out.println("Student details:::::\n"+"name :"+cs.getName()+"\nage :"+cs.getAge()+"\nyear :"+cs.getYear()+"\nMajor :"+cs.getMajor());
	System.out.println("---------------------------");
	Scanner sc=new Scanner(System.in);
	long b=100;
	System.out.println("Teacher details:::::\n"+"name :"+t.getName()+"\nage :"+t.getAge()+"\nSalary :"+t.getSalary()+"\nSubject :"+t.getSubject());
}

}
