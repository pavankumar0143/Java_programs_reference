class A{
	A(){
		System.out.println("hi");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("Demo");
	}
}
public class Demopr {
	public static void main(String[] args) {
		B b =new B();
		System.out.println(b);
	}

}
