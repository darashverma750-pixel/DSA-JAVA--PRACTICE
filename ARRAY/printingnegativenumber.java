
import java.util.Scanner;

public class printingnegativenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the arr size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the array element :");
        for (int i = 0; i <n ; i++){
            arr[i] = sc.nextInt();
        }
        // printing 
        System.out.print("negative number in the array :");
        for(int i = 0; i < n ; i++){
            if (arr[i]<0)
            System.out.print(arr[i]+" ");
        }
    

    }
}
