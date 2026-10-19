
import java.util.Scanner;

public class multiply {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];
        int n = arr.length;
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n ; i++){
         System.out.println("the array element are is " +arr[i]);
        }
        int mult = 1;
      for(int i = 0; i < n ; i++){
         int value = arr[i];
        mult = mult * value;
         
         
    }
     System.out.println("the array element multiply  is " +mult);  
}
    
}
