
import java.util.Scanner;


public class maxofarray{
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int[] arr = new int[5];
     System.out.print("enter the array element to find the maximum :");
     for(int i = 0; i<arr.length; i++){
        arr[i] = sc.nextInt();  // input array 5 element 
        // assuming the array element is 10 20 30 40 50
     }
     System.out.print("the array element are :");
     int max = arr[0]; // first element in the array is 10 which stored in the max variable 
     for(int i = 1 ; i<arr.length;i++){
        System.out.print(arr[i]+" ");
        if (arr[i]>max)
            max = arr[i];
     }
     System.out.println("");
     System.out.println(max+" is the maximum number in the array element");
 }
 }