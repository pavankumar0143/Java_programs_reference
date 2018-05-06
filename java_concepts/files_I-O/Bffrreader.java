import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bffrreader {
public static void main(String[] args) throws IOException {
	InputStreamReader r=new InputStreamReader(System.in);
	BufferedReader br =new BufferedReader(r);
	String s=br.readLine();
	System.out.println(s);
}
}
