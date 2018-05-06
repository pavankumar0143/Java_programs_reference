import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileO_P {
public static void main(String[] args) throws IOException {
	FileOutputStream fo=new FileOutputStream("first.txt");
	String s="Welcome to wipro class";
	byte[] b=s.getBytes();
	fo.write(b);
	FileInputStream fi=new FileInputStream("first.txt");
	int data=0;
	FileOutputStream fo1=new FileOutputStream("Second.txt");
	while((data=fi.read())!=-1){
		fo1.write(data);
	
	}
	System.out.println("FIlE COPIED");
}
}
