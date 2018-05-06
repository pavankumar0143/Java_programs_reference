

class Animals {

	public void eat(){
		System.out.println("Animal eat something ");
	}
	public void sleep(){
		System.out.println("Animal sleeps more than 8 hours");
	}
}
class Birds extends Animals{
	public void eat(){
		System.out.println("Birds eats crums");
	}
	public void sleep(){
		System.out.println("birds sleep on trees");
	}
	public void fly(){
		System.out.println("Birds fly in the sky");
	}
}
public class Animal{
	public static void main(String[] args) {
		Animals a=new Animals();
		a=new Birds();
		Birds b=new Birds();
		a.eat();
		a.sleep();
		b.fly();
	}
}

