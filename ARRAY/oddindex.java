
import java.util.Scanner;

public class oddindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1 ,3 ,2 ,7 ,8 ,5 ,9 ,7 };
        print(arr);
        for(int i = 0 ; i<arr.length ; i++){
            if (i % 2 == 1) arr[i]= arr[i] * 2;
            else arr[i] = arr[i] + 10;       
         }
         print(arr);
    }
    public static void print(int[] arr ) {
        for(int i = 0; i <arr.length;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println("");
        
    }
    
}
