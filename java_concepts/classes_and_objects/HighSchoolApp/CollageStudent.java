package HighSchoolApp;

public class CollageStudent extends Student {
	int year;
	String major;
	public CollageStudent(String name,int age,int year,String major) {
		super(name,age);
		this.major=major;
		this.year=year;
	}
	public int getYear() {
		return year;
	}
	public String getMajor() {
		return major;
	}
	

}
