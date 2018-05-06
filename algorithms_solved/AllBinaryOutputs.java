import java.util.Arrays;

public class AllBinaryOutputs {
		public static String genBit(int num,int n){
			int boo[]=new int[n];
			n=n-1;
			while(num>0){
				boo[n--]=num%2;
				num=num/2;
				}
			return Arrays.toString(boo);
		}
		
		public static void printBits(int size){
			for(int i=0;i<((int)Math.pow(2, size));i++){
				System.out.println(genBit(i,size));
			}
		}
		public static void main(String[] args) {
			printBits(2);
	
		}
}
