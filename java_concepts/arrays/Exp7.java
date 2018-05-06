
public class Exp7 {
	public static void main(String[] args) {
		int array[]={27,39,4,32,7,39,1,4,9,2,2,2,49,27,2,8,39,33,32,4,39};	
	
	 int size = array.length;

     for (int i = 0; i < size; i++) 
     {

         for (int j = i + 1; j < size; j++) 
         {


             if (array[i] == array[j]) 
             {
                 while (j < (size) - 1) 
                 {
                     array[j] = array[j + 1];
                     j++;
                 }   
                 size--;
             }
         }
     }
     for(int i=0;i<size;i++){
    	 System.out.print(array[i]+" ");
     }
 }
}