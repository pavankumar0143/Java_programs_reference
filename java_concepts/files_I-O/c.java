import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class c1 implements Serializable {
		String s;
		transient int i;
		double d;
		public c1(String s, int i, double d) {
		this.s = s;
		this.i = i;
		this.d = d;
		}
		public String toString() {
			return "s="+s +" i=" + i + "; d=" + d;
		}
	}
 public class c {
public static void main(String args[]) {
try {
c1 object1 = new c1("Hello",-7, 2.7e10);
System.out.println("object1; " + object1);
FileOutputStream fos = new FileOutputStream("serial.txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(object1);
oos.flush();
oos.close();
}
catch(Exception e) {

System.out.println("Exception during serialization:"+ e);
}
try {
c1 object2;
FileInputStream fis = new FileInputStream("serial.txt");
ObjectInputStream ois = new ObjectInputStream(fis);
object2 = (c1)ois.readObject();
ois.close();
System.out.println("object2: " + object2);
}
catch(Exception e) {
System.out.println("Exception during deserialization: " + e);
}
}
}