
import java.util.Scanner;

public class printingsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int n  = arr.length;
        // input 
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        // output 
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
        // sum 
        int sum = 0;
        for(int i = 0; i < n; i++){
            int value = arr[i];
            sum = sum + value;
        }
        System.out.println("the sum of the array element is "+sum);
    }
}
