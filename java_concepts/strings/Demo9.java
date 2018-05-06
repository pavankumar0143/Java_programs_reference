//REVERSE OF STRING
public class Demo9 {
public static int Sum(int s){
	int sum=0;
	while (s>0){
		sum=sum+s%10;
		s=s/10;
	}
	if(sum>9){
		sum=Sum(sum);
	}
	return sum;
}
public static void main(String[] args) {
	System.out.println(Sum(976592));
}
}
