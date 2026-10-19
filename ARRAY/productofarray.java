
import java.util.Scanner;

public class productofarray {  
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    System.out.println("enter the array element :");
    for(int i = 0;i < arr.length;i++){
        arr[i] = sc.nextInt();
    }
    System.out.print("array element are :");
    int product = 1;
    for(int i = 0; i< arr.length;i++){
        System.out.print(arr[i]+" ");
        product = arr[i] * product;
    }
    System.out.println("\nthe product of the array element are is :"+product);
    }
}
