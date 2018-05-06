import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;
public class FIlesEditingWithVector {
	public static void main(String[] args) throws IOException {
	FileOutputStream fo1=new FileOutputStream("1st_file.txt");
	FileOutputStream fo2=new FileOutputStream("2st_file.txt");
	FileOutputStream fo3=new FileOutputStream("3st_file.txt");
	String s1="FileOutputStream fo1=new FileOutputStream()\n";
	String s2="FileOutputStream fo2=new FileOutputStream()\n";
	String s3="FileOutputStream fo3=new FileOutputStream()\n";
	byte[] b1=s1.getBytes();
	byte[] b2=s2.getBytes();
	byte[] b3=s3.getBytes();
	fo1.write(b1);
	fo2.write(b2);
	fo3.write(b3);
	FileInputStream fi1=new FileInputStream("1st_file.txt");
	FileInputStream fi2=new FileInputStream("2st_file.txt");
	FileInputStream fi3=new FileInputStream("3st_file.txt");
	Vector v=new Vector();
	v.add(fi1);
	v.add(fi2);
	v.add(fi3);
	Enumeration em=v.elements();
	SequenceInputStream sis=new SequenceInputStream(em);
	int data=0;
	while((data=sis.read())!=-1){
		System.out.print((char)data);
	}
	}
}
