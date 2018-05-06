package com.klu.coll.empmain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import com.klu.coll.empbean.Employee;
import com.klu.coll.empservice.BankService;

public class MainClass {
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Employee emp;
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			emplist.add(new Employee(sc.nextInt(),sc.next(),sc.nextDouble()));
			}
		ListIterator<Employee> emp1=emplist.listIterator();
		while(emp1.hasNext()){
			emp=(Employee)emp1.next();
		System.out.println(emp.getEmpid()+" "+emp.getEmpname()+" "+emp.getSalary());
	}
		System.out.println("__________________________\n               ");
		ListIterator<Employee> emplist1=BankService.validateEmp(emplist).listIterator();
		while(emplist1.hasNext()){
				emp=(Employee)emplist1.next();
			System.out.println(emp.getEmpid()+" "+emp.getEmpname()+" "+emp.getSalary());
		}
		
	}

}
