
public class CrossPattern {

	public static void printPattern(String s){
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(i==j||j==(arr.length-i-1)){
					System.out.print(arr[j]);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern("123456789");
	}
}
