package unitTest;

class ALE {
	void man(){
		System.out.println("IN Class man");
	}
}
class ULE extends ALE{
	@Override
	void man(){
		System.out.println("In Class Min");
	}
}
public class Test2{
	
	public static void main(String[] args) {
		ULE u=new ULE();
		u.man();
}

}