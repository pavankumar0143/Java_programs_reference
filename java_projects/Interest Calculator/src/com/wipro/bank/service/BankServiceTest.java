package com.wipro.bank.service;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Collection;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BankServiceTest {

	private float principal;
	private int tenure;
	private int age;
	private String gender;
	private String output;
	private String output1;
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	public BankServiceTest(float principal, int tenure, int age, String gender, String output, String output1) {
		this.principal = principal;
		this.tenure = tenure;
		this.age = age;
		this.gender = gender;
		this.output = output;
		this.output1=output1;
	}
	
	@Parameters
	public static Collection<Object[]> generateData(){
		
		Object data[][] = {
				{500.f, 10, 50, "Male","true","101618.66"},
				{300.f, 12, 50, "FMale","false","0.0"},
				{300.f, 8, 50, "Male","false","0.0"},
				{300.f, 10, 150, "Male","false","0.0"},
				{3000.f, 10, 50, "Male1","false","0.0"},
				{3000.f, 10, 50, "FeMale","true","623796.0"},
				{3000.f, 5, 50, "female","true","234979.78"},
				{10.f, -10, 50, "Male","false","0.0"},
				{3000.f, 10, -50, "Male","false","0.0"},
				{-3000.f, 10, 50, "Male","false","0.0"},
				{1111.0f, 5, 50, "Male","true","86093.07"},
				{1000.f, 5, 50, "Female","true","78326.59"},
				{24568.0f, 5, 50, "Male","true","1903811.5"}
				
		};
		
		return Arrays.asList(data);
	}
	
	@Test
	public void testValidateData() {
		BankService bs = new BankService();
		assertEquals(output, bs.validateData(principal, tenure, age, gender)+"");
	}

	@Test
	public void testCalculate() {
		BankService bs = new BankService();
		assertEquals(output1, bs.calculate(principal, tenure, age, gender)+"");
	}

}
