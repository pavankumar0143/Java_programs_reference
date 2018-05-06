
class cal {
	public static int powerInt(int a,int b){
		int c=(int)Math.pow(a, b);
		return c;
	}
	public static double powerDouble(double a,int b){
		double c=Math.pow(a, b);
		return c;
	}

}
public class Calculator{
	public static void main(String[] args) {
		System.out.println("cal.powerInt("+3+","+ 4+") ="+cal.powerInt(3, 4));
		System.out.println("cal.powerDouble("+3.33+","+ 4+") ="+cal.powerDouble(3.33, 4));
	}
}
