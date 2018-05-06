
public class Employee {
	int id;
	String name;
	Address ad;
	public Employee(int id,String name,Address ad){
		this.ad=ad;
		this.name=name;
		this.id=id;
	}
	void display(){
		System.out.print(ad.city+"\n"+ad.Street+"\n"+ad.State);
	}
	public static void main(String args[]){
		Address add=new Address("Shing nagar","Vijayawada","Krishna");
		Employee em=new Employee(4309,"pavan",add);
		em.display();
		
	}
}
