
public class ValidateNumber {

	public static boolean valid(String s){
		try{
			if(s.contains(".") && s.contains("e")){
				Double.parseDouble(s.substring(0,s.indexOf("e"))+s.substring(s.indexOf("e")+1, s.length()));
				return true;
			}
			else if(s.contains("e")){
				Integer.parseInt(s.substring(0,s.indexOf("e"))+s.substring(s.indexOf("e")+1, s.length()));
				return true;
				}
			else if(s.contains(".")){
				Double.parseDouble(s);
				return true;
			}
			else{
				Integer.parseInt(s);
				return true;
			}
		}
		catch(Exception e){
			return false;
		}
	}
	public static void main(String[] args) {
		String s="1a";
		System.out.println("Valid :"+valid(s));
	}
}
