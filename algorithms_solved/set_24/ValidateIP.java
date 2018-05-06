package set_24;
import java.lang.Exception;
public class ValidateIP {
//	check range of ip
	static boolean check(String subIp){
		try{
			int add=Integer.parseInt(subIp);
			if(add>=0 && add<256){
				return true;
			}
		}
		catch(Exception e){
			return false;
		}
		return false;
		}
//	validate ip
	static boolean validate(String ip){
		String[]s=ip.split("\\.");
		int count=0;
		for(int i=0;i<s.length;i++){
			if(check(s[i])){
				count++;
			}
		}
		if(count==4){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String ip="192.168.a1.1";
		System.out.println(validate(ip));
	}
}
