
class Patient {
	String name;double height,weight;
 public Patient(String name,double height,double weight){
	 this.name=name;
	 this.height=height;
	 this.weight=weight;
 }
 public  double BMI(){
	 return (weight/height)*height*703;
 }
}

public class Patients{
	public static void main(String[] args) {
		Patient P=new Patient("Pavan",61.8,187.39);
		System.out.println("Patient's BMI :"+(float)P.BMI());
	}
}