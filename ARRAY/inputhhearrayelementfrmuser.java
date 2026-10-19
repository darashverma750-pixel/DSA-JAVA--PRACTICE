
import java.util.Scanner;

public class inputhhearrayelementfrmuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        int[] arr = new int[5];
        System.out.print("enter the array element :");
        for(int i = 0; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        // printing 
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
