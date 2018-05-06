
public class Strings13 {
	public static void main(String[] args) {
		String S=args[0];
		boolean t=S.regionMatches(2, "xy", 0, 2);
		System.out.println(t);
	}
}
