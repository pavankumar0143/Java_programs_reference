import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharecterStream_I_o {
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("1st_Filewriter.txt");
	String s="public static void main(String[] args) throws IOException";
	fw.write(s);
	fw.close();
	FileReader fr=new FileReader("1st_Filewriter.txt");
	int data=0;
	while((data=fr.read())!=-1){
	System.out.print((char)data);
	}
}
}
