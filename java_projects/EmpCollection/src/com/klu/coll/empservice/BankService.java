package com.klu.coll.empservice;

import java.util.ArrayList;
import java.util.ListIterator;

import com.klu.coll.empbean.Employee;

public class BankService {
	public static ArrayList<Employee> validateEmp(ArrayList<Employee> empList){ 
		ListIterator<Employee> itt=empList.listIterator();
		while(itt.hasNext()){
			Employee em=(Employee) itt.next();
			if(!((em.getEmpid()>=1000 && em.getEmpid()<2000) && (em.getEmpname().length()>=8 ) && (em.getSalary()>=10000.0))){
				itt.remove();
			}
		}
		return empList;
	}
}